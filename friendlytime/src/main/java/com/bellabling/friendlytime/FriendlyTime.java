package com.bellabling.friendlytime;


public class FriendlyTime
{
	public static final int ONE_MINUTE = 60;
	public static final int TWO_MINUTES = ONE_MINUTE * 2;
	public static final int TEN_MINUTES = ONE_MINUTE * 10;
	public static final int FIFTEEN_MINUTES = ONE_MINUTE * 15;
	public static final int TWENTY_MINUTES = ONE_MINUTE * 20;
	public static final int TWENTY_FIVE_MINUTES = ONE_MINUTE * 25;
	public static final int THIRTY_MINUTES = ONE_MINUTE * 30;
	public static final int FORTY_FIVE_MINUTES = ONE_MINUTE * 45;
	public static final int ONE_HOUR = ONE_MINUTE * 60;
	public static final int TWO_HOURS = ONE_HOUR * 2;
	public static final int THREE_HOURS = ONE_HOUR * 3;
	public static final int TWELVE_HOURS = ONE_HOUR * 12;
	public static final int EIGHTEEN_HOURS = ONE_HOUR * 18;
	public static final int ONE_DAY = ONE_HOUR * 24;
	public static final int TWO_DAYS = ONE_DAY * 2;
	public static final int THREE_DAYS = ONE_DAY * 3;
	public static final int ONE_WEEK = ONE_DAY * 7;
	public static final int TWO_WEEKS = ONE_WEEK * 2;
	public static final int THREE_WEEKS = ONE_WEEK * 3;
	public static final long TWO_MONTHS = ONE_DAY * 28 * 2;
	public static final long ONE_YEAR = TWO_MONTHS * 6;
	public static final long TWO_YEARS = ONE_YEAR * 2;
	public static final long THREE_YEARS = ONE_YEAR * 3;
	
	private static final int ONE_SECOND_IN_MILLIS = 1000;

	public static String getFriendlyTime(long timeNow, long timeThen)
	{
		long timeInMillis = timeNow - timeThen;
		long timeInSecs = timeInMillis / ONE_SECOND_IN_MILLIS;
		
		if(timeInSecs < ONE_MINUTE)
		{
			return "seconds ago";
		}
		
		if(timeInSecs < TWO_MINUTES)
		{
			return "about a minute ago";
		}
		
		if(timeInSecs < TEN_MINUTES)
		{
			return "minutes ago";
		}
		
		if(timeInSecs < FIFTEEN_MINUTES)
		{
			return "about 10 minutes ago";
		}
		
		if(timeInSecs < TWENTY_MINUTES)
		{
			return "about 15 minutes ago";
		}
		
		if(timeInSecs < TWENTY_FIVE_MINUTES)
		{
			return "about 20 minutes ago";
		}
		
		if(timeInSecs < THIRTY_MINUTES)
		{
			return "about 25 minutes ago";
		}
		
		if(timeInSecs < FORTY_FIVE_MINUTES)
		{
			return "half an hour ago";
		}
		
		if(timeInSecs < ONE_HOUR)
		{
			return "about 45 minutes ago";
		}
		
		if(timeInSecs < TWO_HOURS)
		{
			return "about an hour ago";
		}
		
		if(timeInSecs < THREE_HOURS)
		{
			return "a couple of hours ago";
		}
		
		if(timeInSecs < TWELVE_HOURS)
		{
			return "a few hours ago";
		}
		
		if(timeInSecs < EIGHTEEN_HOURS)
		{
			return "about 12 hours ago";
		}
		
		if(timeInSecs < ONE_DAY)
		{
			return "about 18 hours ago";
		}

		if(timeInSecs < TWO_DAYS)
		{
			return "yesterday";
		}

		if(timeInSecs < THREE_DAYS)
		{
			return "a couple of days ago";
		}

		if(timeInSecs < ONE_WEEK)
		{
			return "days ago";
		}

		if(timeInSecs < TWO_WEEKS)
		{
			return "about a week ago";
		}

		if(timeInSecs < THREE_WEEKS)
		{
			return "a couple of weeks ago";
		}

		if(timeInSecs < TWO_MONTHS)
		{
			return "weeks ago";
		}

		if(timeInSecs < ONE_YEAR)
		{
			return "months ago";
		}

		if(timeInSecs < TWO_YEARS)
		{
			return "about a year ago";
		}
		
		if(timeInSecs < THREE_YEARS)
		{
			return "a couple of years ago";
		}
		
		return "years ago";
	}

}
