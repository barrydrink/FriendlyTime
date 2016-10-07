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

	/**
	 * Loads the string into the UI
	 *
	 * @param nowTime	the current time in milliseconds
	 * @param otherTime	the time to compare to the current time, in milliseconds
	 *
	 * @return 			the string description of the time difference
	 */
	public static String getFriendlyTime(long nowTime, long otherTime)
	{
		long timeInMillis = nowTime - otherTime;
		long timeInSecs = Math.abs(timeInMillis) / ONE_SECOND_IN_MILLIS;
		
		if(timeInSecs < ONE_MINUTE)
		{
			if(timeInMillis > 0)
				return "seconds ago";
			else
				return "in less than a minute";
		}
		
		if(timeInSecs < TWO_MINUTES)
		{
			if(timeInMillis > 0)
				return "about a minute ago";
			else
				return "in about a minute";
		}
		
		if(timeInSecs < TEN_MINUTES)
		{
			if(timeInMillis > 0)
				return "minutes ago";
			else
				return "in a few minutes";
		}
		
		if(timeInSecs < FIFTEEN_MINUTES)
		{
			if(timeInMillis > 0)
				return "about 10 minutes ago";
			else
				return "in about 10 minutes";
		}
		
		if(timeInSecs < TWENTY_MINUTES)
		{
			if(timeInMillis > 0)
				return "about 15 minutes ago";
			else
				return "in about 15 minutes";
		}
		
		if(timeInSecs < TWENTY_FIVE_MINUTES)
		{
			if(timeInMillis > 0)
				return "about 20 minutes ago";
			else
				return "in about 20 minutes";
		}
		
		if(timeInSecs < THIRTY_MINUTES)
		{
			if(timeInMillis > 0)
				return "about 25 minutes ago";
			else
				return "in about 25 minutes";
		}
		
		if(timeInSecs < FORTY_FIVE_MINUTES)
		{
			if(timeInMillis > 0)
				return "half an hour ago";
			else
				return "in about half an hour";
		}
		
		if(timeInSecs < ONE_HOUR)
		{
			if(timeInMillis > 0)
				return "about 45 minutes ago";
			else
				return "in about 45 minutes";
		}
		
		if(timeInSecs < TWO_HOURS)
		{
			if(timeInMillis > 0)
				return "about an hour ago";
			else
				return "in about an hour";
		}
		
		if(timeInSecs < THREE_HOURS)
		{
			if(timeInMillis > 0)
				return "a couple of hours ago";
			else
				return "in a couple of hours";
		}
		
		if(timeInSecs < TWELVE_HOURS)
		{
			if(timeInMillis > 0)
				return "a few hours ago";
			else
				return "in a few hours";
		}
		
		if(timeInSecs < EIGHTEEN_HOURS)
		{
			if(timeInMillis > 0)
				return "about 12 hours ago";
			else
				return "in about 12 hours";
		}
		
		if(timeInSecs < ONE_DAY)
		{
			if(timeInMillis > 0)
				return "about 18 hours ago";
			else
				return "in about 18 hours";
		}

		if(timeInSecs < TWO_DAYS)
		{
			if(timeInMillis > 0)
				return "yesterday";
			else
				return "tomorrow";
		}

		if(timeInSecs < THREE_DAYS)
		{
			if(timeInMillis > 0)
				return "a couple of days ago";
			else
				return "in a couple of days";
		}

		if(timeInSecs < ONE_WEEK)
		{
			if(timeInMillis > 0)
				return "days ago";
			else
				return "in a few days";
		}

		if(timeInSecs < TWO_WEEKS)
		{
			if(timeInMillis > 0)
				return "about a week ago";
			else
				return "in about a week";
		}

		if(timeInSecs < THREE_WEEKS)
		{
			if(timeInMillis > 0)
				return "a couple of weeks ago";
			else
				return "in a couple of weeks";
		}

		if(timeInSecs < TWO_MONTHS)
		{
			if(timeInMillis > 0)
				return "weeks ago";
			else
				return "in a few weeks";
		}

		if(timeInSecs < ONE_YEAR)
		{
			if(timeInMillis > 0)
				return "months ago";
			else
				return "in a few months";
		}

		if(timeInSecs < TWO_YEARS)
		{
			if(timeInMillis > 0)
				return "about a year ago";
			else
				return "in about a year";
		}
		
		if(timeInSecs < THREE_YEARS)
		{
			if(timeInMillis > 0)
				return "a couple of years ago";
			else
				return "in a couple of years";
		}

		if(timeInMillis > 0)
			return "years ago";
		else
			return "years from now";
	}
}
