package com.sds.icto.emaillist.test;

import java.util.List;

import com.sds.icto.emaillist.dao.EmailListDao;
import com.sds.icto.emaillist.vo.EmailListVo;

public class TestEmailListDao {

	public static void main(String[] args) {
		try {
			// 0. Delete Test
//			testDelete();
			
			// 1. Insert Test
			// testInsert();

			// 2. FetchList Test
			testFetchList();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void testFetchList() throws Exception {

		EmailListDao dao = new EmailListDao();
		List<EmailListVo> list = dao.fetchList();

		for (EmailListVo vo : list) {
			System.out.print(vo.getNo() + ":");
			System.out.print(vo.getFirstName() + ":");
			System.out.print(vo.getLastName() + ":");
			System.out.print(vo.getEmail());
			System.out.print("\n");
		}

	}
	
	public static void testDelete() throws Exception {
		EmailListDao dao = new EmailListDao();
		dao.delete();
	}

	public static void testInsert() throws Exception {
		
		EmailListDao dao = new EmailListDao();
		
		EmailListVo vo = new EmailListVo();
		vo.setFirstName("ChaeHo");
		vo.setLastName("Yang");
		vo.setEmail("msyluv@naver.com");

		vo = new EmailListVo();
		vo.setFirstName("ChaeHo2");
		vo.setLastName("Yang2");
		vo.setEmail("msyluv@naver.com2");
		
		dao.insert(vo);
	}

}
