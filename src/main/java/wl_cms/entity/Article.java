package wl_cms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_article")
public class Article {

	@Id
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator", strategy = "uuid")
	private String id;
	@Column(name = "title", length = 50)
	private String title;
	@Column(name = "html_content", length = 50)
	private String htmlContent;
	@Column(name = "text_content", length = 50)
	private String textContent;
	@Column(name = "summary", length = 50)
	private String summary;
	@Column(name = "create_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;
	@Column(name = "update_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTime;
}
