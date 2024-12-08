package com.prgrmsfinal.skypedia.planShare.entity;

import java.time.LocalDateTime;

import com.prgrmsfinal.skypedia.member.entity.Member;
import com.prgrmsfinal.skypedia.planShare.entity.key.PlanGroupScrapId;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanGroupScrap {
	@EmbeddedId
	private PlanGroupScrapId id;

	@ManyToOne
	@MapsId("planGroupId")
	private PlanGroup planGroup;

	@ManyToOne
	@MapsId("memberId")
	private Member member;

	private LocalDateTime scrapedAt;
}