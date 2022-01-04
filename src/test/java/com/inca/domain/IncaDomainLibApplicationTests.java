package com.inca.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.inca.domain.model.ImageInformationObject;
import com.inca.domain.model.InformationObject;
import com.inca.domain.repository.ImageInformationObjectRepository;
import com.inca.domain.repository.InformationObjectRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
//@DataJpaTest
//@TestPropertySource("classpath:application-test.properties")
@ActiveProfiles("test")
class IncaDomainLibApplicationTests {

	@Autowired
	private InformationObjectRepository ior;
	
	@Autowired
	private ImageInformationObjectRepository iior;

	@Test
	void contextLoads() {
		ImageInformationObject iio = new ImageInformationObject();
		iio.setName("testimage");
		iio = iior.save(iio);
		
		
		InformationObject io = new InformationObject();
		io.setName("testname");
		io = ior.save(io);
		
		System.out.println("Image id: " + iio.getId());
		System.out.println("Object id: " + iio.getId());
		
		Iterable<InformationObject> all = ior.findAll();
		for(InformationObject a : all) {
			System.out.println(a);
		}
		
		Iterable<ImageInformationObject> allImages = iior.findAll();
		for(ImageInformationObject ia : allImages) {
			System.out.println(ia);
		}
	
		assertEquals(ior.count(), 2);
	}

}
