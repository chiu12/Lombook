import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {

	@Getter(AccessLevel.PUBLIC)
	@Setter(AccessLevel.PUBLIC)
	private String firstname;
	@Getter
	@Setter
    private boolean isGoodStudent;
	
	
	
}
