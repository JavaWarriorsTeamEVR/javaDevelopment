package com.mwappsjira.bean;

import net.rcarz.jiraclient.RestClient;
import net.rcarz.jiraclient.WorkLog;
import net.sf.json.JSONObject;

public class WorkLogBean extends WorkLog {
	
	protected WorkLogBean(RestClient restclient, JSONObject json) {
		super(restclient, json);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WorkLogBean [getAuthor()=");
		builder.append(getAuthor());
		builder.append(", getComment()=");
		builder.append(getComment());
		builder.append(", getCreatedDate()=");
		builder.append(getCreatedDate());
		builder.append(", getUpdateAuthor()=");
		builder.append(getUpdateAuthor());
		builder.append(", getUpdatedDate()=");
		builder.append(getUpdatedDate());
		builder.append(", getTimeSpentSeconds()=");
		builder.append(getTimeSpentSeconds());
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", getUrl()=");
		builder.append(getUrl());
		builder.append(", getSelf()=");
		builder.append(getSelf());
		builder.append("]");
		return builder.toString();
	}

}
