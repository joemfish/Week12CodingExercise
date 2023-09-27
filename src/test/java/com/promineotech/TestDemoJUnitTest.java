package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
		
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPostiveNumbersAreAddedCorrectly() {
		int a = 4;
		int b = 8; 
		int expected = 12;
		boolean expectException = false;
		
		if(!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}
		
	}

	static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(
				arguments(2,4,6,false),
				arguments(-3, 0, -3, false),
				arguments(-1, -1, -2, false),
				arguments(0, 4, 4, false),
				arguments(0, 0, 0, false),
				arguments(17, 1116, 1133, false));
	}
	
	
	
	
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		
		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);
		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
		assertThat(testDemo.addPositive(6, 7)).isEqualTo(13);
		assertThat(testDemo.addPositive(1, 13)).isEqualTo(14);
		
	}
	
	
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForIsThisABaseballTeam")
	void assertThatTeamNameIsInList() {
		String teamName = "Red Sox";
		String expected = teamName + " is a baseball team!";
		boolean expectException = false;
		
		if(!expectException) {
			assertThat(testDemo.isThisABaseballTeam(teamName)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.isThisABaseballTeam(teamName)).isInstanceOf(IllegalArgumentException.class);
		}
		
		
		
	}
	static Stream<Arguments> argumentsForIsThisABaseballTeam() {
		return Stream.of(
				arguments("Red Sox", "Red Sox is a baseball team!", false),
				arguments("BlueJays", "BlueJays is not a baseball team", true),
				arguments("Braves", "Braves is a baseball team!", false),
				arguments("abc", "abc is not a baseball team.", true),
				arguments("", " is not a baseball team.", true),
				arguments("Dodgers", "Dodgers are a baseball team!", false));
				
	}
	
	
	@Test
	
	void assertThatNumberSquaredIsCorrect() {
		
		TestDemo mockDemo = spy(testDemo);
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
