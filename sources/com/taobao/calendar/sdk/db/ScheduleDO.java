package com.taobao.calendar.sdk.db;

import com.taobao.calendar.sdk.db.schedule.KeyValue;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import tb.f51;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScheduleDO extends BaseEventDO {
    public static final List<KeyValue> REMIND_ITEMS;
    public static final List<KeyValue> REMIND_ITEMS_ALLDAY;
    public static final List<KeyValue> RPEAT_ITEMS;
    public long alartTime;
    public String description;
    public String eventId;
    public String link;
    public String type;
    public String userId;
    public long remind = f51.DEF_MAX_ASYNC_SECONDS;
    public boolean isRepeat = false;
    public Repeat repeat = new Repeat();

    public ScheduleDO() {
        Calendar instance = Calendar.getInstance();
        this.startTime = instance.getTimeInMillis();
        instance.add(11, 1);
        this.endTime = instance.getTimeInMillis();
    }

    private String calculateTimeOffset() {
        int rint = (int) Math.rint(this.remind / 60);
        int floor = (int) Math.floor(rint / 60);
        if (floor > 0) {
            return floor + "小时" + (rint % 60) + "分钟";
        }
        return rint + "分钟";
    }

    public String genRemindStr() {
        if (this.isAllDay) {
            for (KeyValue keyValue : REMIND_ITEMS_ALLDAY) {
                StringBuilder sb = new StringBuilder();
                sb.append(keyValue.getKey());
                sb.append(" :: ");
                sb.append(this.remind);
                if (keyValue.getKey().equals(Long.valueOf(this.remind))) {
                    long j = this.remind;
                    if (j == 0 || j == -1) {
                        return keyValue.getValue();
                    }
                    return keyValue.getValue() + "提醒";
                }
            }
            return null;
        }
        for (KeyValue keyValue2 : REMIND_ITEMS) {
            if (keyValue2.getKey().equals(Long.valueOf(this.remind))) {
                long j2 = this.remind;
                if (j2 == 0 || j2 == -1) {
                    return keyValue2.getValue();
                }
                return "提前" + keyValue2.getValue() + "提醒";
            }
        }
        return "提前" + calculateTimeOffset() + "提醒";
    }

    public boolean isRemindExpire() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.startTime;
        long j2 = this.remind;
        long j3 = j - (1000 * j2);
        if (j2 != -1 && j3 <= currentTimeMillis) {
            return true;
        }
        return false;
    }

    public String origEventId() {
        if (this.eventId == null) {
            return null;
        }
        return this.eventId.substring(String.valueOf(this.sourceId).length());
    }

    public void processRepeat(long j) {
        if (!this.repeat.unit.equals("n") && this.startTime < j) {
            Calendar instance = Calendar.getInstance();
            int calendarFlag = this.repeat.getCalendarFlag();
            if (calendarFlag != 0) {
                instance.setTimeInMillis(this.startTime);
                while (instance.getTimeInMillis() < j) {
                    instance.add(calendarFlag, this.repeat.interval);
                }
                this.startTime = instance.getTimeInMillis();
            }
        }
    }

    public void setStartTime(Long l) {
        this.startTime = l.longValue();
        Date date = new Date();
        date.setTime(l.longValue());
        this.theDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    @Override // com.taobao.calendar.sdk.db.BaseEventDO
    public String toString() {
        return "ScheduleDO [userId=" + this.userId + ", eventId=" + this.eventId + ", type=" + this.type + ", remind=" + this.remind + ", alartTime=" + this.alartTime + ", isRepeat=" + this.isRepeat + ", repeat=" + this.repeat + ", description=" + this.description + ", link=" + this.link + ", uid=" + this.uid + ", sourceId=" + this.sourceId + ", title=" + this.title + ", theDate=" + this.theDate + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isAllDay=" + this.isAllDay + ", isEditable=" + this.isEditable + ", isDeleted=" + this.isDeleted + ", sync=" + this.sync + ", isOnclickEventMark=" + this.isOnclickEventMark + "]";
    }

    static {
        t2o.a(414187568);
        ArrayList arrayList = new ArrayList();
        RPEAT_ITEMS = arrayList;
        ArrayList arrayList2 = new ArrayList();
        REMIND_ITEMS = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        REMIND_ITEMS_ALLDAY = arrayList3;
        arrayList.addAll(Arrays.asList(new KeyValue(new Repeat(1, "n"), "仅一次"), new KeyValue(new Repeat(1, "d"), "每天"), new KeyValue(new Repeat(1, "w"), "每周"), new KeyValue(new Repeat(2, "w"), "每两周"), new KeyValue(new Repeat(1, "m"), "每月"), new KeyValue(new Repeat(1, "y"), "一年一次")));
        arrayList3.addAll(Arrays.asList(new KeyValue(-1L, "不提醒"), new KeyValue(54000L, "前一天早上 (09:00)"), new KeyValue(43200L, "前一天中午 (12:00)"), new KeyValue(10800L, "前一天晚上 (21:00)")));
        arrayList2.addAll(Arrays.asList(new KeyValue(-1L, "不提醒"), new KeyValue(0L, "准点提醒"), new KeyValue(600L, "10分钟"), new KeyValue(900L, "15分钟"), new KeyValue(Long.valueOf((long) f51.DEF_MAX_ASYNC_SECONDS), "30分钟"), new KeyValue(3600L, "1小时"), new KeyValue(7200L, "2小时"), new KeyValue(86400L, "一天")));
    }
}
