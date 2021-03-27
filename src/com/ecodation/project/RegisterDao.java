package com.ecodation.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class RegisterDao implements ICrudInterface<RegisterDto> {

	@Override
	public void create(RegisterDto registerDto) {
		try (Connection connection = getConnection()) {
			String sql = "insert into admin6 (name,surname,password,email) values (?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getName());
			preparedStatement.setString(2, registerDto.getSurname());
			preparedStatement.setString(3, registerDto.getPassword());
			preparedStatement.setString(4, registerDto.getEmail());
			int rowEffect = preparedStatement.executeUpdate();
			if (rowEffect > 0) {
				System.out.println("Başarılı bir şekilde eklendi");
			} else {
				System.out.println("BAŞARISIZ ekleme yapılamadı");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(RegisterDto registerDto) {
		try (Connection connection = getConnection()) {
			String sql = "update  admin6 set name=?,surname=?,password=?,email=? where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getName());
			preparedStatement.setString(2, registerDto.getSurname());
			preparedStatement.setString(3, registerDto.getPassword());
			preparedStatement.setString(4, registerDto.getEmail());
			preparedStatement.setLong(5, registerDto.getId());
			int rowEffect = preparedStatement.executeUpdate();
			if (rowEffect > 0) {
				System.out.println("Başarılı bir şekilde güncellendi");
			} else {
				System.out.println("BAŞARISIZ güncellenmedi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(RegisterDto registerDto) {
		try (Connection connection = getConnection()) {
			String sql = "delete from  admin6  where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, registerDto.getId());
			int rowEffect = preparedStatement.executeUpdate();
			if (rowEffect > 0) {
				System.out.println("Başarılı bir şekilde silindi");
			} else {
				System.out.println("BAŞARISIZ silinemedi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<RegisterDto> list() {
		ArrayList<RegisterDto> registerList = new ArrayList<RegisterDto>();
		RegisterDto registerDto;
		try (Connection connection = getConnection()) {
			String sql = "select *  from  admin6";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				registerDto = new RegisterDto();
				registerDto.setId(resultSet.getLong("id"));
				registerDto.setName(resultSet.getString("name"));
				registerDto.setSurname(resultSet.getString("surname"));
				registerDto.setPassword(resultSet.getString("password"));
				registerDto.setEmail(resultSet.getString("email"));
				registerList.add(registerDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}

	public boolean isPasswordResult() {
		// emailadres=root@gmail.com
		// şifre:123

		int kalan = 3;
		while (kalan > 0) {

			System.out.println("kalan hakkınız: " + kalan);
			Scanner klavye = new Scanner(System.in);
			String emailDefault = "root@gmail.com", passwordDefault = "123";

			String kullaniciEmail, kullaniciPassword;
			System.out.println("lütfen email adresinizi giriniz");
			kullaniciEmail = klavye.nextLine();

			System.out.println("lütfen şifre adresinizi giriniz");
			kullaniciPassword = klavye.nextLine();

			if ((kullaniciEmail.equals(emailDefault)) && (kullaniciPassword.equals(passwordDefault))) {
				return true;
			}
			kalan--;
			if (kalan <= 0) {
				System.out.println("Kartınız bloke oldu Müşteri hizmetlerini arayınız 0850 000 000 00");

				System.exit(0);
			}
		}

		return false;

	}

	public void allResult() {

		while (true) {
			boolean result = isPasswordResult();
			System.out.println(" ");
			if (result) {
				System.out.println("..............Admin paneline giriş yapıyorsunuz..............");
				Scanner klavye = new Scanner(System.in);
				while (true) {
					System.out.println("\n1-)Ekleme\n2-)Güncelleme\n3-)Silme\n4-)Seçme\n5-)çıkış");
					int chooise = klavye.nextInt();

					switch (chooise) {
						case 1:
							System.out.println("************Ekleme alanı****************");
							registerCreate();
							break;
						case 2:
							System.out.println("************Güncelleme alanı****************");
							// registerSelect();
							registerUpdate();
							break;
						case 3:
							System.out.println("************Silme alanı****************");
							registerSelect();
							registerDelete();
							break;
						case 4:
							System.out.println("************Seçme alanı****************");
							registerSelect();
							break;
						case 5:
							System.out.println("Çıkış yapılıyor.");
							System.exit(0);
							break;
						default:
							System.out.println("Lütfen belirtilen alanı dışında seçim yapmayınız");
							break;
					}
				}
			} else {
				System.out.println("Şifreniz yanlıştır.");
			}
		}

	}

	private void registerSelect() {
		RegisterDto registerDto = new RegisterDto();
		RegisterDao registerDao = new RegisterDao();
		ArrayList<RegisterDto> listem = registerDao.list();

		for (RegisterDto temp : listem) {
			System.out.println(temp);
		}

	}

	private void registerDelete() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Silmek istediğiniz id yazınız");
		int value = klavye.nextInt();
		RegisterDto registerDto = new RegisterDto();
		registerDto.setId(value);
		RegisterDao registerDao = new RegisterDao();
		registerDao.delete(registerDto);

	}

	private void registerUpdate() {
		Scanner klavye = new Scanner(System.in);
		String ad, soyad, sifre, email;
		System.out.println("güncelenecek ad giriniz");
		ad = klavye.nextLine();
		System.out.println("güncelenecek soyad giriniz");
		soyad = klavye.nextLine();
		System.out.println("güncelenecek şifre giriniz");
		sifre = klavye.nextLine();
		System.out.println("güncelenecek email giriniz");
		email = klavye.nextLine();
		System.out.println("Güncellemek istediğiniz id yazınız");
		int value = klavye.nextInt();
		RegisterDto registerDto = new RegisterDto(value, ad, soyad, sifre, email);
		RegisterDao registerDao = new RegisterDao();
		registerDao.update(registerDto);

	}

	private void registerCreate() {
		Scanner klavye = new Scanner(System.in);
		String ad, soyad, sifre, email;
		System.out.println("eklemek için ad giriniz");
		ad = klavye.nextLine();
		System.out.println("eklemek için  soyad giriniz");
		soyad = klavye.nextLine();
		System.out.println("eklemek için  şifre giriniz");
		sifre = klavye.nextLine();
		System.out.println("eklemek için  email giriniz");
		email = klavye.nextLine();
		RegisterDto registerDto = new RegisterDto(0, ad, soyad, sifre, email);
		RegisterDao registerDao = new RegisterDao();
		registerDao.create(registerDto);

	}

}
