package com.barrydrink.friendlytime;

import org.junit.Assert;
import org.junit.Test;

public class FriendlyTimeTest
{
	@Test
	public void testGetFriendlyTimeAfterAFewSeconds()
	{
		long timeNow = 10000;
		long timeThen = 5000;

		Assert.assertEquals("seconds ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterAMinute()
	{
		long timeNow = FriendlyTime.ONE_MINUTE * 1000;
		long timeThen = 0;

		Assert.assertEquals("about a minute ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoMinutes()
	{
		long timeNow = FriendlyTime.TWO_MINUTES * 1000;
		long timeThen = 0;

		Assert.assertEquals("minutes ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterFiveMinutes()
	{
		long timeNow = FriendlyTime.ONE_MINUTE * 5 * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("minutes ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTenMinutes()
	{
		long timeNow = FriendlyTime.TEN_MINUTES * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about 10 minutes ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterFifteenMinutes()
	{
		long timeNow = FriendlyTime.FIFTEEN_MINUTES * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about 15 minutes ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeTwentyMinutes()
	{
		long timeNow = FriendlyTime.TWENTY_MINUTES * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about 20 minutes ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTwentyFiveMinutes()
	{
		long timeNow = FriendlyTime.TWENTY_FIVE_MINUTES * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about 25 minutes ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterThirtyMinutes()
	{
		long timeNow = FriendlyTime.THIRTY_MINUTES * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("half an hour ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterFortyFiveMinutes()
	{
		long timeNow = FriendlyTime.FORTY_FIVE_MINUTES * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about 45 minutes ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterAnHour()
	{
		long timeNow = FriendlyTime.ONE_HOUR * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about an hour ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoHours()
	{
		long timeNow = FriendlyTime.TWO_HOURS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("a couple of hours ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterThreeHours()
	{
		long timeNow = FriendlyTime.THREE_HOURS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("a few hours ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTwelveHours()
	{
		long timeNow = FriendlyTime.TWELVE_HOURS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about 12 hours ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterEighteenHours()
	{
		long timeNow = FriendlyTime.EIGHTEEN_HOURS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about 18 hours ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTwentyFourHours()
	{
		long timeNow = FriendlyTime.ONE_DAY * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("yesterday", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoDays()
	{
		long timeNow = FriendlyTime.TWO_DAYS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("a couple of days ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterThreeDays()
	{
		long timeNow = FriendlyTime.THREE_DAYS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("days ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterOneWeek()
	{
		long timeNow = FriendlyTime.ONE_WEEK * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about a week ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoWeeks()
	{
		long timeNow = FriendlyTime.TWO_WEEKS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("a couple of weeks ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterThreeWeeks()
	{
		long timeNow = FriendlyTime.THREE_WEEKS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("weeks ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoMonths()
	{
		long timeNow = FriendlyTime.TWO_MONTHS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("months ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterOneYear()
	{
		long timeNow = FriendlyTime.ONE_YEAR * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("about a year ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoYears()
	{
		long timeNow = FriendlyTime.TWO_YEARS * 1000;
		long timeThen = 0;
		
		Assert.assertEquals("a couple of years ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}

	@Test
	public void testGetFriendlyTimeAfterThreeYears()
	{
		long timeNow = (FriendlyTime.TWO_YEARS * 1000) + (FriendlyTime.ONE_YEAR * 1000);
		long timeThen = 0;
		
		Assert.assertEquals("years ago", FriendlyTime.getFriendlyTime(timeNow, timeThen));
	}
}
