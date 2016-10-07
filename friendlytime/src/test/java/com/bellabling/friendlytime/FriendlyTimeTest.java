package com.bellabling.friendlytime;

import org.junit.Assert;
import org.junit.Test;

public class FriendlyTimeTest
{
	@Test
	public void testGetFriendlyTimeAfterAFewSeconds()
	{
		long nowTime = 10000;
		long otherTime = 5000;

		Assert.assertEquals("seconds ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterAMinute()
	{
		long nowTime = FriendlyTime.ONE_MINUTE * 1000;
		long otherTime = 0;

		Assert.assertEquals("about a minute ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoMinutes()
	{
		long nowTime = FriendlyTime.TWO_MINUTES * 1000;
		long otherTime = 0;

		Assert.assertEquals("minutes ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterFiveMinutes()
	{
		long nowTime = FriendlyTime.ONE_MINUTE * 5 * 1000;
		long otherTime = 0;

		Assert.assertEquals("minutes ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTenMinutes()
	{
		long nowTime = FriendlyTime.TEN_MINUTES * 1000;
		long otherTime = 0;

		Assert.assertEquals("about 10 minutes ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterFifteenMinutes()
	{
		long nowTime = FriendlyTime.FIFTEEN_MINUTES * 1000;
		long otherTime = 0;

		Assert.assertEquals("about 15 minutes ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeTwentyMinutes()
	{
		long nowTime = FriendlyTime.TWENTY_MINUTES * 1000;
		long otherTime = 0;

		Assert.assertEquals("about 20 minutes ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTwentyFiveMinutes()
	{
		long nowTime = FriendlyTime.TWENTY_FIVE_MINUTES * 1000;
		long otherTime = 0;

		Assert.assertEquals("about 25 minutes ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterThirtyMinutes()
	{
		long nowTime = FriendlyTime.THIRTY_MINUTES * 1000;
		long otherTime = 0;

		Assert.assertEquals("half an hour ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterFortyFiveMinutes()
	{
		long nowTime = FriendlyTime.FORTY_FIVE_MINUTES * 1000;
		long otherTime = 0;

		Assert.assertEquals("about 45 minutes ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterAnHour()
	{
		long nowTime = FriendlyTime.ONE_HOUR * 1000;
		long otherTime = 0;

		Assert.assertEquals("about an hour ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoHours()
	{
		long nowTime = FriendlyTime.TWO_HOURS * 1000;
		long otherTime = 0;

		Assert.assertEquals("a couple of hours ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterThreeHours()
	{
		long nowTime = FriendlyTime.THREE_HOURS * 1000;
		long otherTime = 0;

		Assert.assertEquals("a few hours ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTwelveHours()
	{
		long nowTime = FriendlyTime.TWELVE_HOURS * 1000;
		long otherTime = 0;

		Assert.assertEquals("about 12 hours ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterEighteenHours()
	{
		long nowTime = FriendlyTime.EIGHTEEN_HOURS * 1000;
		long otherTime = 0;

		Assert.assertEquals("about 18 hours ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTwentyFourHours()
	{
		long nowTime = FriendlyTime.ONE_DAY * 1000;
		long otherTime = 0;

		Assert.assertEquals("yesterday", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoDays()
	{
		long nowTime = FriendlyTime.TWO_DAYS * 1000;
		long otherTime = 0;

		Assert.assertEquals("a couple of days ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterThreeDays()
	{
		long nowTime = FriendlyTime.THREE_DAYS * 1000;
		long otherTime = 0;

		Assert.assertEquals("days ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterOneWeek()
	{
		long nowTime = FriendlyTime.ONE_WEEK * 1000;
		long otherTime = 0;

		Assert.assertEquals("about a week ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoWeeks()
	{
		long nowTime = FriendlyTime.TWO_WEEKS * 1000;
		long otherTime = 0;

		Assert.assertEquals("a couple of weeks ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterThreeWeeks()
	{
		long nowTime = FriendlyTime.THREE_WEEKS * 1000;
		long otherTime = 0;

		Assert.assertEquals("weeks ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoMonths()
	{
		long nowTime = FriendlyTime.TWO_MONTHS * 1000;
		long otherTime = 0;

		Assert.assertEquals("months ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterOneYear()
	{
		long nowTime = FriendlyTime.ONE_YEAR * 1000;
		long otherTime = 0;

		Assert.assertEquals("about a year ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterTwoYears()
	{
		long nowTime = FriendlyTime.TWO_YEARS * 1000;
		long otherTime = 0;

		Assert.assertEquals("a couple of years ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeAfterThreeYears()
	{
		long nowTime = (FriendlyTime.TWO_YEARS * 1000) + (FriendlyTime.ONE_YEAR * 1000);
		long otherTime = 0;

		Assert.assertEquals("years ago", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

//////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void testGetFriendlyTimeWithASecondsToGo()
	{
		long nowTime = 10000;
		long otherTime = 15000;

		Assert.assertEquals("in less than a minute", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyWithAMinuteToGo()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.ONE_MINUTE * 1000;

		Assert.assertEquals("in about a minute", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwoMinutes()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TWO_MINUTES * 1000;

		Assert.assertEquals("in a few minutes", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutFiveMinutes()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.ONE_MINUTE * 5 * 1000;

		Assert.assertEquals("in a few minutes", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTenMinutes()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TEN_MINUTES * 1000;

		Assert.assertEquals("in about 10 minutes", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutFifteenMinutes()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.FIFTEEN_MINUTES * 1000;

		Assert.assertEquals("in about 15 minutes", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwentyMinutes()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TWENTY_MINUTES * 1000;

		Assert.assertEquals("in about 20 minutes", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwentyFiveMinutes()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TWENTY_FIVE_MINUTES * 1000;

		Assert.assertEquals("in about 25 minutes", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutThirtyMinutes()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.THIRTY_MINUTES * 1000;

		Assert.assertEquals("in about half an hour", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutFortyFiveMinutes()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.FORTY_FIVE_MINUTES * 1000;

		Assert.assertEquals("in about 45 minutes", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutAnHour()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.ONE_HOUR * 1000;

		Assert.assertEquals("in about an hour", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwoHours()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TWO_HOURS * 1000;

		Assert.assertEquals("in a couple of hours", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutThreeHours()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.THREE_HOURS * 1000;

		Assert.assertEquals("in a few hours", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwelveHours()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TWELVE_HOURS * 1000;

		Assert.assertEquals("in about 12 hours", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutEighteenHours()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.EIGHTEEN_HOURS * 1000;

		Assert.assertEquals("in about 18 hours", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwentyFourHours()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.ONE_DAY * 1000;

		Assert.assertEquals("tomorrow", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwoDays()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TWO_DAYS * 1000;

		Assert.assertEquals("in a couple of days", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutThreeDays()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.THREE_DAYS * 1000;

		Assert.assertEquals("in a few days", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutOneWeek()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.ONE_WEEK * 1000;

		Assert.assertEquals("in about a week", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwoWeeks()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TWO_WEEKS * 1000;

		Assert.assertEquals("in a couple of weeks", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutThreeWeeks()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.THREE_WEEKS * 1000;

		Assert.assertEquals("in a few weeks", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwoMonths()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TWO_MONTHS * 1000;

		Assert.assertEquals("in a few months", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutOneYear()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.ONE_YEAR * 1000;

		Assert.assertEquals("in about a year", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutTwoYears()
	{
		long nowTime = 0;
		long otherTime = FriendlyTime.TWO_YEARS * 1000;

		Assert.assertEquals("in a couple of years", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}

	@Test
	public void testGetFriendlyTimeInAboutThreeYears()
	{
		long nowTime = 0;
		long otherTime = (FriendlyTime.TWO_YEARS * 1000) + (FriendlyTime.ONE_YEAR * 1000);

		Assert.assertEquals("years from now", FriendlyTime.getFriendlyTime(nowTime, otherTime));
	}
}
