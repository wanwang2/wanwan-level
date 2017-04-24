package org.wanwanframework.level.simplesql;
/**
 *Author: Jiangtao He; Email: ross.jiangtao.he@gmail.com
 *File Name: FileDBToolTest.java
 *Date: 2011-12-31
 *Copyright: All right reserved by author - Jiangtao He
 *Version: MyJavaExpert v1.0
 */

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Author: Jiangtao He; Email: ross.jiangtao.he@gmail.com Date: 2011-12-31
 * Since: MyJavaExpert v1.0 Description:
 */
public class FileDBToolTest {
	private FileDBTool oFileDBTool;

	/**
	 * Author: Jiangtao He; Email: ross.jiangtao.he@gmail.com Date: 2011-12-31
	 * Description:
	 */
	@Before
	public void setUp() throws Exception {
		oFileDBTool = new FileDBTool();
	}

	/**
	 * Test method for
	 * {@link com.ross.filedb.FileDBTool#insert(java.lang.Object)}.
	 * 
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws NoSuchMethodException
	 * @throws IOException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 */
	@Test
	public void testInsert() throws SecurityException, IllegalArgumentException, IOException, NoSuchMethodException,
			IllegalAccessException, InvocationTargetException {
		// initialize the parameter
		T_HomeBean tHomeBean = new T_HomeBean();
		tHomeBean.setId("Ross_1");
		tHomeBean.setName("Ross's Home");
		tHomeBean.setEmail("ross.jiangtao.he@gmail.com");
		tHomeBean.setPhone("252363693");
		tHomeBean.setAddress("China P.R.");

		// add home
		ResultBean oResult = this.oFileDBTool.insert(tHomeBean);

		System.out.println("Insert one home record - result: " + oResult.getResult() + "; description: "
				+ oResult.getDescription());
		assertTrue("Inert one home record to Text DB", oResult.getResult());

		// // initialize the parameter
		T_FamilyMemberBean tFamilyMemberBean = new T_FamilyMemberBean();
		tFamilyMemberBean.setId("Yan");
		tFamilyMemberBean.setName("Pery");
		tFamilyMemberBean.setMobile("252363693");
		tFamilyMemberBean.setGender("Female");
		tFamilyMemberBean.setEmail("ross.jiangtao.he@gmail.com");
		tFamilyMemberBean.setFamily_id(tHomeBean.getId());

		// add member
		oResult = this.oFileDBTool.insert(tFamilyMemberBean);

		System.out.println("Insert one faminily member record - result: " + oResult.getResult() + "; description: "
				+ oResult.getDescription());

		assertTrue("Inert one family member record to Text DB", oResult.getResult());
	}

	/**
	 * Test method for {@link com.ross.filedb.FileDBTool#queryAll)}.
	 * 
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 */
	@Test
	public void testQueryAll() throws IllegalArgumentException, SecurityException, IllegalAccessException,
			InvocationTargetException, NoSuchMethodException, InstantiationException, IOException {
		// initialize the parameter
		T_HomeBean tHomeBean = new T_HomeBean();
		List<T_HomeBean> oHList;

		oHList = this.oFileDBTool.queryAll(tHomeBean);

		System.out.println("Query all the home record(s) from file, totally get : " + oHList.size() + " record(s)");
		assertTrue("Query all home records from Text DB", 0 < oHList.size());

		T_FamilyMemberBean tFamilyMemberBean = new T_FamilyMemberBean();
		List<T_FamilyMemberBean> oMList;

		oMList = this.oFileDBTool.queryAll(tFamilyMemberBean);

		System.out.println(
				"Query all the family member record(s) from file, totally get : " + oMList.size() + " record(s)");
		assertTrue("Query all family member record(s) from Text DB", 0 < oMList.size());
	}

	/**
	 * Test method for {@link com.ross.filedb.FileDBTool#update)}.
	 * 
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws NoSuchMethodException
	 * @throws IOException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 */
	// @Test
	public void testUpdate() throws SecurityException, IllegalArgumentException, IOException, NoSuchMethodException,
			IllegalAccessException, InvocationTargetException {
		ResultBean oResult;

		// initialize the parameter
		T_HomeBean tHomeBean = new T_HomeBean();
		tHomeBean.setId("Ross_1");
		tHomeBean.setName("Pery's Home O(��_��)O~~");
		tHomeBean.setEmail("ross.jiangtao.he@gmail.com");
		tHomeBean.setPhone("252363693");
		tHomeBean.setAddress("China P.R.");

		T_FamilyMemberBean tFamilyMemberBean = new T_FamilyMemberBean();
		tFamilyMemberBean.setId("Yan");
		tFamilyMemberBean.setName("Pery");
		tFamilyMemberBean.setMobile("10086 O(��_��)O~~");
		tFamilyMemberBean.setGender("Female");
		tFamilyMemberBean.setEmail("ross.jiangtao.he@gmail.com");
		tFamilyMemberBean.setFamily_id(tHomeBean.getId());

		// Update member
		oResult = this.oFileDBTool.update(tFamilyMemberBean, tFamilyMemberBean.getId());

		System.out.println("Update one faminily member record - result: " + oResult.getResult() + "; description: "
				+ oResult.getDescription());

		assertTrue("Update one family member record to Text DB", oResult.getResult());

		// Update home
		oResult = this.oFileDBTool.update(tHomeBean, tHomeBean.getId());

		System.out.println("Update one home record - result: " + oResult.getResult() + "; description: "
				+ oResult.getDescription());
		assertTrue("Update one home record to Text DB", oResult.getResult());
	}

	/**
	 * Test method for {@link com.ross.filedb.FileDBTool#delete}.
	 * 
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws NoSuchMethodException
	 * @throws IOException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 */
	// @Test
	public void testDelete() throws SecurityException, IllegalArgumentException, IOException, NoSuchMethodException,
			IllegalAccessException, InvocationTargetException {
		ResultBean oResult;

		// initialize the parameter
		T_HomeBean tHomeBean = new T_HomeBean();
		tHomeBean.setId("Ross_1");
		tHomeBean.setName("Pery's Home O(��_��)O~~");
		tHomeBean.setEmail("ross.jiangtao.he@gmail.com");
		tHomeBean.setPhone("252363693");
		tHomeBean.setAddress("China P.R.");

		T_FamilyMemberBean tFamilyMemberBean = new T_FamilyMemberBean();
		tFamilyMemberBean.setId("Yan");
		tFamilyMemberBean.setName("Pery");
		tFamilyMemberBean.setMobile("10086 O(��_��)O~~");
		tFamilyMemberBean.setGender("Female");
		tFamilyMemberBean.setEmail("ross.jiangtao.he@gmail.com");
		tFamilyMemberBean.setFamily_id(tHomeBean.getId());

		// delete member
		oResult = this.oFileDBTool.delete(tFamilyMemberBean);

		System.out.println("Delete one faminily member record - result: " + oResult.getResult() + "; description: "
				+ oResult.getDescription());

		assertTrue("Detelte one family member record from Text DB", oResult.getResult());

		// delete home
		oResult = this.oFileDBTool.delete(tHomeBean);

		System.out.println("Delete one home record - result: " + oResult.getResult() + "; description: "
				+ oResult.getDescription());
		assertTrue("Delete one home record from Text DB", oResult.getResult());
	}

}
