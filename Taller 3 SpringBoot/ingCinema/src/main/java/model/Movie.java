package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Movie {
    private String title;
    private String imageUrl;
    private String gender;
    private String classification;
    private int duration;
    private String director;
    private String synopsis;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", gender='" + gender + '\'' +
                ", classification='" + classification + '\'' +
                ", duration=" + duration +
                ", director='" + director + '\'' +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }
}
