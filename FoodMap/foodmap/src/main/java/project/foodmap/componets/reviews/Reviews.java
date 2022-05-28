package project.foodmap.componets.reviews;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "review")
@Table(
    name = "review"
)
public class Reviews {
    @Id
    @Column(columnDefinition = "serial", 
        name = "id", 
        nullable = false, 
        updatable = false
    )
    @SequenceGenerator(
        name= "reviews_sequence",
        sequenceName = "reviews_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "reviews_sequence"
    )
    private Long id;

    @Column(
        name="user_id",
        nullable = false,
        columnDefinition = "INTEGER"
    )
    private Long user_id;

    @Column(
        name="restaurant_id",
        nullable = false,
        columnDefinition = "INTEGER"
    )
    private Long restaurant_id;

    @Column(
        name="rating",
        nullable = false,
        columnDefinition = "INTEGER"
    )
    private Integer rating;

    @Column(
        name="review",
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String review;

    @Column(
        name="order_",
        nullable = true,
        columnDefinition = "TEXT"
    )
    private String order;

    @Column(
        name="cost",
        nullable = false,
        columnDefinition = "DECIMAL"
    )
    private Double cost;

    @Column(
        name="visit_date",
        nullable = false,
        columnDefinition = "INTEGER"
    )
    private Integer visit_date;


    public Reviews() {
    }

    public Reviews( Long user_id, Long restaurant_id, Integer rating, String review, String order, Double cost, Integer visit_date) {
        this.user_id = user_id;
        this.restaurant_id = restaurant_id;
        this.rating = rating;
        this.review = review;
        this.order = order;
        this.cost = cost;
        this.visit_date = visit_date;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return this.user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getRestaurant_id() {
        return this.restaurant_id;
    }

    public void setRestaurant_id(Long restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getVisit_date() {
        return this.visit_date;
    }

    public void setVisit_date(Integer visit_date) {
        this.visit_date = visit_date;
    }


}
