package com.taobao.calendar.sdk.aidl;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import com.taobao.calendar.aidl.service.ICalendarService;
import com.taobao.calendar.sdk.TBCalendar;
import com.taobao.calendar.sdk.common.DateUtils;
import com.taobao.calendar.sdk.common.Utils;
import com.taobao.calendar.sdk.db.ScheduleDO;
import com.taobao.calendar.sdk.db.TableSchedule;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarServiceImpl extends Service {
    public static final String TAG = "CalendarServiceImpl";
    public static boolean inited = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ServiceBinder extends ICalendarService.Stub {
        private CalendarListener listener = null;

        static {
            t2o.a(414187531);
        }

        public ServiceBinder() {
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void cancelReminder(int i, String str) throws RemoteException {
            cancelReminderNew(i, str, Utils.getUserIdByReflect());
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void cancelReminderNew(int i, String str, String str2) throws RemoteException {
            if (this.listener != null) {
                TableSchedule.QueryHandler queryHandler = new TableSchedule.QueryHandler() { // from class: com.taobao.calendar.sdk.aidl.CalendarServiceImpl.ServiceBinder.1
                    @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
                    public void callback(int i2) {
                        new StringBuilder("cancelReminder callback:").append(i2);
                    }
                };
                try {
                    try {
                        if (CalendarServiceImpl.inited) {
                            TableSchedule.cancelSchedule(str, i, queryHandler, str2);
                            this.listener.onSuccess(true, str, null);
                        } else {
                            this.listener.onError("context is null!", str);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        this.listener.onError(e.getMessage(), str);
                    }
                    this.listener = null;
                } catch (Throwable th) {
                    this.listener = null;
                    throw th;
                }
            } else {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void checkReminderExist(int i, String str) throws RemoteException {
            CalendarListener calendarListener = this.listener;
            if (calendarListener != null) {
                try {
                    try {
                        if (CalendarServiceImpl.inited) {
                            this.listener.onSuccess(TableSchedule.CheckSchedule(str, String.valueOf(i)), str, null);
                        } else {
                            calendarListener.onError("context is null!", str);
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        this.listener.onError(e.toString(), str);
                    }
                    this.listener = null;
                } catch (Throwable th) {
                    this.listener = null;
                    throw th;
                }
            } else {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void getReminds(int i, String str, String str2, String str3) throws RemoteException {
            if (this.listener == null) {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
            } else if (i > 0 && str != null) {
                if (str3.equalsIgnoreCase("ASC") || str3.equalsIgnoreCase("DESC")) {
                    try {
                        try {
                            if (CalendarServiceImpl.inited) {
                                String[] schedulesBetween = TableSchedule.getSchedulesBetween(String.valueOf(i), str, str2, str3);
                                if (schedulesBetween != null) {
                                    this.listener.onSuccess(true, null, schedulesBetween);
                                } else {
                                    CalendarListener calendarListener = this.listener;
                                    calendarListener.onError("strs is null!", i + "");
                                }
                            } else {
                                CalendarListener calendarListener2 = this.listener;
                                calendarListener2.onError("context is null!", i + "");
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                            this.listener.onError(e.toString(), String.valueOf(i));
                        }
                        this.listener = null;
                    } catch (Throwable th) {
                        this.listener = null;
                        throw th;
                    }
                }
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void getRemindsNew(int i, String str, String str2, String str3) throws RemoteException {
            if (this.listener == null) {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
            } else if (i > 0 && str != null) {
                if (str3.equalsIgnoreCase("ASC") || str3.equalsIgnoreCase("DESC")) {
                    try {
                        try {
                            if (CalendarServiceImpl.inited) {
                                String[] schedulesBetweenNew = TableSchedule.getSchedulesBetweenNew(String.valueOf(i), str, str2, str3);
                                if (schedulesBetweenNew != null) {
                                    this.listener.onSuccess(true, null, schedulesBetweenNew);
                                } else {
                                    CalendarListener calendarListener = this.listener;
                                    calendarListener.onError("result is null!", i + "");
                                }
                            } else {
                                CalendarListener calendarListener2 = this.listener;
                                calendarListener2.onError("context is null!", i + "");
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                            this.listener.onError(e.toString(), String.valueOf(i));
                        }
                        this.listener = null;
                    } catch (Throwable th) {
                        this.listener = null;
                        throw th;
                    }
                }
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void queryAllReminds(String str) throws RemoteException {
            if (this.listener != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        this.listener.onError("param error. param is empty", "");
                        return;
                    }
                    JSONObject parseObject = JSON.parseObject(str);
                    if (parseObject == null) {
                        this.listener.onError("param error. param is empty", "");
                        return;
                    }
                    if (parseObject.containsKey("start_time") && parseObject.containsKey(ExperimentDO.COLUMN_END_TIME)) {
                        String string = parseObject.getString("start_time");
                        String string2 = parseObject.getString(ExperimentDO.COLUMN_END_TIME);
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            String formatCompat = DateUtils.formatCompat(string, "yyyyMMddHHmmss", "yyyy-MM-dd");
                            String formatCompat2 = DateUtils.formatCompat(string2, "yyyyMMddHHmmss", "yyyy-MM-dd");
                            String string3 = parseObject.getString("source_id");
                            if (!TextUtils.isEmpty(string3) && "0".equals(string3)) {
                                string3 = "";
                            }
                            String string4 = parseObject.getString("user_id");
                            int intValue = parseObject.getIntValue("pageSize");
                            int intValue2 = parseObject.getIntValue("currentPage");
                            if (intValue <= 0) {
                                intValue = 10;
                            }
                            if (intValue2 <= 1) {
                                intValue2 = 1;
                            }
                            String str2 = ((intValue2 - 1) * intValue) + " , " + intValue;
                            String string5 = parseObject.getString("filterCancellation");
                            if (CalendarServiceImpl.inited) {
                                String[] queryAllReminds = TableSchedule.queryAllReminds(formatCompat, formatCompat2, string3, string4, string5, str2);
                                if (queryAllReminds != null) {
                                    this.listener.onSuccess(true, null, queryAllReminds);
                                    return;
                                }
                                this.listener.onError("result is null!", string3 + "");
                                return;
                            }
                            this.listener.onError("context is null!", string3 + "");
                            return;
                        }
                        this.listener.onError("param error. startTime or endTime is empty!", "");
                        return;
                    }
                    this.listener.onError("param error. startTime or endTime is empty!", "");
                } catch (Exception e) {
                    this.listener.onError(e.toString(), "");
                }
            } else {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void queryAllRemindsCount(String str) throws RemoteException {
            if (this.listener != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        this.listener.onError("param error. param is empty", "");
                        return;
                    }
                    JSONObject parseObject = JSON.parseObject(str);
                    if (parseObject == null) {
                        this.listener.onError("param error. param is empty", "");
                        return;
                    }
                    if (parseObject.containsKey("start_time") && parseObject.containsKey(ExperimentDO.COLUMN_END_TIME)) {
                        String string = parseObject.getString("start_time");
                        String string2 = parseObject.getString(ExperimentDO.COLUMN_END_TIME);
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            String formatCompat = DateUtils.formatCompat(string, "yyyyMMddHHmmss", "yyyy-MM-dd");
                            String formatCompat2 = DateUtils.formatCompat(string2, "yyyyMMddHHmmss", "yyyy-MM-dd");
                            String string3 = parseObject.getString("source_id");
                            if (!TextUtils.isEmpty(string3) && "0".equals(string3)) {
                                string3 = "";
                            }
                            String string4 = parseObject.getString("user_id");
                            String string5 = parseObject.getString("filterCancellation");
                            if (CalendarServiceImpl.inited) {
                                String[] queryAllRemindsCount = TableSchedule.queryAllRemindsCount(formatCompat, formatCompat2, string3, string4, string5);
                                if (queryAllRemindsCount != null) {
                                    this.listener.onSuccess(true, null, queryAllRemindsCount);
                                    return;
                                }
                                CalendarListener calendarListener = this.listener;
                                calendarListener.onError("result is null!", string3 + "");
                                return;
                            }
                            CalendarListener calendarListener2 = this.listener;
                            calendarListener2.onError("context is null!", string3 + "");
                            return;
                        }
                        this.listener.onError("param error. startTime or endTime is empty!", "");
                        return;
                    }
                    this.listener.onError("param error. startTime or endTime is empty!", "");
                } catch (Exception e) {
                    this.listener.onError(e.toString(), "");
                }
            } else {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void registerListener(CalendarListener calendarListener) throws RemoteException {
            this.listener = calendarListener;
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void setReminder(ScheduleDTO scheduleDTO) throws RemoteException {
            setReminderNew(scheduleDTO, Utils.getUserIdByReflect());
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void setReminderNew(ScheduleDTO scheduleDTO, String str) throws RemoteException {
            String str2;
            if (this.listener != null) {
                TableSchedule.QueryHandler queryHandler = new TableSchedule.QueryHandler() { // from class: com.taobao.calendar.sdk.aidl.CalendarServiceImpl.ServiceBinder.2
                    @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
                    public void callback(int i) {
                        String.valueOf(i);
                    }
                };
                if (scheduleDTO != null) {
                    ScheduleDO scheduleDO = new ScheduleDO();
                    scheduleDO.sourceId = scheduleDTO.getSourceId();
                    scheduleDO.eventId = scheduleDTO.getEventId();
                    try {
                        try {
                            scheduleDO.setStartTime(Long.valueOf(CalendarServiceImpl.this.stringToDate(scheduleDTO.getStartTime(), "yyyyMMddHHmmss").getTime()));
                            scheduleDO.endTime = CalendarServiceImpl.this.stringToDate(scheduleDTO.getEndTime(), "yyyyMMddHHmmss").getTime();
                            if (TextUtils.isEmpty(scheduleDTO.getTitle())) {
                                str2 = "title";
                            } else {
                                str2 = scheduleDTO.getTitle();
                            }
                            scheduleDO.title = str2;
                            scheduleDO.description = scheduleDTO.getDescription();
                            boolean z = false;
                            scheduleDO.isAllDay = scheduleDTO.getIsallday() == 1;
                            String link = scheduleDTO.getLink();
                            String replaceOrAddQueryParameter = Utils.replaceOrAddQueryParameter(link, "spm", "a2141.7779397." + scheduleDTO.getSourceId());
                            if (TextUtils.isEmpty(replaceOrAddQueryParameter)) {
                                replaceOrAddQueryParameter = "link";
                            }
                            scheduleDO.link = replaceOrAddQueryParameter;
                            scheduleDO.isRepeat = scheduleDTO.getIsrepeat() == 1;
                            if (scheduleDTO.getIseditable() == 1) {
                                z = true;
                            }
                            scheduleDO.isEditable = z;
                            scheduleDO.remind = TextUtils.isEmpty(String.valueOf(scheduleDTO.getRemind())) ? 300L : scheduleDTO.getRemind();
                            if (CalendarServiceImpl.inited) {
                                TableSchedule.newSchedule(scheduleDO, queryHandler, str);
                                this.listener.onSuccess(true, scheduleDO.eventId, null);
                            } else {
                                this.listener.onError("context is null!", scheduleDTO.getEventId());
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                            this.listener.onError(e.toString(), scheduleDO.eventId);
                        } catch (Exception e2) {
                            this.listener.onError(e2.toString(), scheduleDO.eventId);
                        }
                        this.listener = null;
                    } catch (Throwable th) {
                        this.listener = null;
                        throw th;
                    }
                }
            } else {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
            }
        }
    }

    static {
        t2o.a(414187530);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date stringToDate(String str, String str2) throws Exception {
        if (str == null) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return simpleDateFormat.parse(str, parsePosition);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new ServiceBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Application application = getApplication();
        if (application != null) {
            TBCalendar.init(application);
            inited = true;
        }
    }
}
