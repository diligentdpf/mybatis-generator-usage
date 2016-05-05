package test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.dao.PetMapper;
import test.model.Pet;
import test.model.PetExample;

public class Test {

	public static void main(String[] args) throws Exception {
		String resource = "MapperConfig.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		SqlSession sqlSession = sqlMapper.openSession();

		PetExample pet = new PetExample();
		pet.or().andDeathIsNotNull();
		try {
			PetMapper mapper = sqlSession.getMapper(PetMapper.class);
			List<Pet> allRecords = mapper.selectByExample(pet);
			for (Pet s : allRecords)
				System.out.println(s);
		} finally {
			sqlSession.close();
		}
	}
}
