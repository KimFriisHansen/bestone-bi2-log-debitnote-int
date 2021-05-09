package com.bestseller.bestone.bi4.log.goodsinapi.goodsinapi.domains.userinfo.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "VERIFIED_TYPE", indexes = {@Index(unique = true, name="verified_type_idx", columnList = "TYPE"), @Index(unique = true, name="verified_type_publicid_idx", columnList = "PUBLIC_ID")})
@Entity
public class VerifiedType extends BaseEntity {

  @Id
  @SequenceGenerator(name = "VERIFIED_TYPE_GENERATOR", sequenceName = "VERIFIED_TYPE_SEQUENCE", allocationSize = 100)
  @GeneratedValue(generator = "VERIFIED_TYPE_GENERATOR")
  @Column(unique = true)
  private Long id;
  @Column(name="TYPE", nullable = false)
  private String type;
  @Column(name="DESCRIPTION")
  private String description;
  @Column(name = "DELETED", nullable = false)
  private boolean deleted;
  @Column(name = "PUBLIC_ID", nullable = false)
  private UUID publicId;
}
