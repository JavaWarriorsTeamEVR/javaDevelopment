package com.mwappsjira.wrappers;

import net.rcarz.jiraclient.ICredentials;
import net.rcarz.jiraclient.JiraClient;

public class JiraClientWrpapper extends JiraClient {
	
	public JiraClientWrpapper(String uri) {
		super(uri);
	}

	public JiraClientWrpapper(String uri, ICredentials creds) {
		super(uri, creds);
	}

}
