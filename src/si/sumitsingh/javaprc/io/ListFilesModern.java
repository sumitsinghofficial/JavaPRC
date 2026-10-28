package si.sumitsingh.javaprc.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListFilesModern {
	public static void main(String[] args) throws IOException {
		
		Path path=Paths.get("Docs");
		
		Stream<Path> list = Files.list(path);
		
		List<Path> collect = list.filter(Files::isRegularFile).map(Path::getFileName).collect(Collectors.toList());
		
	
		System.out.println(collect);
		
	}

}
