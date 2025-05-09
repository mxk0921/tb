package com.taobao.calendar.aidl.business;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.taobao.android.service.Services;
import com.taobao.calendar.aidl.business.alarm.CalendarAlarm;
import com.taobao.calendar.aidl.business.db.TableSchedule;
import com.taobao.calendar.aidl.jsbridge.calendarJsApi;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import com.taobao.calendar.aidl.service.ICalendarService;
import com.taobao.tao.Globals;
import java.util.List;
import tb.fsw;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarAidlAdapter {
    private static ICalendarService calendarService;
    private static Context context;
    private static CalendarAidlAdapter instance = new CalendarAidlAdapter();
    private static String TAG = "TBCalendar";

    private CalendarAidlAdapter() {
    }

    public static synchronized CalendarAidlAdapter getInstance() {
        CalendarAidlAdapter calendarAidlAdapter;
        synchronized (CalendarAidlAdapter.class) {
            try {
                if (instance == null) {
                    instance = new CalendarAidlAdapter();
                }
                calendarAidlAdapter = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return calendarAidlAdapter;
    }

    public static void initCalendarJS() {
        try {
            fsw.i("TBURLCacheAlias", calendarJsApi.class, true);
            fsw.f("TBURLCache", "setRemindFinish", "TBURLCacheAlias", "setRemindFinish");
            fsw.f("TBURLCache", "addCalendarPlan", "TBURLCacheAlias", "addCalendarPlan");
            fsw.f("TBURLCache", "cancelCalendarPlan", "TBURLCacheAlias", "cancelCalendarPlan");
            fsw.f("TBURLCache", "checkCalendarPlanIsExist", "TBURLCacheAlias", "checkCalendarPlanIsExist");
            fsw.f("TBURLCache", "getCalendarPlansBySourceId", "TBURLCacheAlias", "getReminds");
            fsw.f("TBURLCache", "addCalendarPlanByBatch", "TBURLCacheAlias", "addCalendarPlanByBatch");
            fsw.f("TBURLCache", "cancelCalendarPlanByBatch", "TBURLCacheAlias", "cancelCalendarPlanByBatch");
            fsw.f("TBURLCache", "checkCalendarPlanIsExistByBatch", "TBURLCacheAlias", "checkCalendarPlanIsExistByBatch");
            fsw.f("TBURLCache", "queryRemindList", "TBURLCacheAlias", "queryRemindList");
            fsw.f("TBURLCache", "queryRemindCount", "TBURLCacheAlias", "queryRemindCount");
        } catch (Exception e) {
            e.printStackTrace();
        }
        setAlarmToSystem(TableSchedule.getRecentRemindSchedule());
    }

    private static void setAlarmToSystem(List<ScheduleDTO> list) {
        AlarmManager alarmManager;
        if (!(list == null || list.size() <= 0 || Globals.getApplication() == null || (alarmManager = (AlarmManager) Globals.getApplication().getSystemService("alarm")) == null)) {
            int i = 0;
            while (i < list.size()) {
                ScheduleDTO scheduleDTO = list.get(i);
                if (scheduleDTO != null) {
                    long alartTime = scheduleDTO.getAlartTime();
                    int hashCode = String.valueOf(scheduleDTO.getAlartTime()).hashCode();
                    StringBuilder sb = new StringBuilder();
                    sb.append(scheduleDTO.getEventId());
                    sb.append(",");
                    for (int i2 = i + 1; i2 < list.size(); i2++) {
                        ScheduleDTO scheduleDTO2 = list.get(i2);
                        if (scheduleDTO2 != null) {
                            if (scheduleDTO2.getAlartTime() != alartTime) {
                                break;
                            }
                            sb.append(scheduleDTO2.getEventId());
                            sb.append(",");
                            i = i2;
                        }
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    String sb2 = sb.toString();
                    alarmManager.cancel(ya.e(Globals.getApplication(), hashCode, new Intent(CalendarAlarm.INTENT_PLAY), 268435456));
                    Intent intent = new Intent(CalendarAlarm.INTENT_PLAY);
                    intent.putExtra("id", sb2);
                    alarmManager.set(0, scheduleDTO.getAlartTime(), ya.e(Globals.getApplication(), hashCode, intent, 268435456));
                }
                i++;
            }
        }
    }

    public void cancelReminder(int i, String str) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.cancelReminder(i, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelReminderNew(int i, String str, String str2) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.cancelReminderNew(i, str, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkReminderExist(int i, String str) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.checkReminderExist(i, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getReminds(int i, String str, String str2, String str3) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.getReminds(i, str, str2, str3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getRemindsNew(int i, String str, String str2, String str3) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.getRemindsNew(i, str, str2, str3);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService getReminders exception");
            e.printStackTrace();
        }
    }

    public void init(Context context2) {
        if (context2 != null && calendarService == null) {
            context = context2;
            new AsyncTask<Object, Object, Boolean>() { // from class: com.taobao.calendar.aidl.business.CalendarAidlAdapter.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public Boolean doInBackground(Object... objArr) {
                    if (CalendarAidlAdapter.calendarService == null) {
                        ICalendarService unused = CalendarAidlAdapter.calendarService = (ICalendarService) Services.get(Globals.getApplication(), ICalendarService.class);
                    }
                    return Boolean.TRUE;
                }
            }.execute(new Object());
        }
    }

    public void queryAllReminds(String str) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.queryAllReminds(str);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService queryAllReminds exception");
            e.printStackTrace();
        }
    }

    public void queryAllRemindsCount(String str) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.queryAllRemindsCount(str);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService queryAllRemindsCount exception");
            e.printStackTrace();
        }
    }

    public void registerListener(CalendarListener calendarListener) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.registerListener(calendarListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setReminder(ScheduleDTO scheduleDTO) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.setReminder(scheduleDTO);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService setReminder exception");
            e.printStackTrace();
        }
    }

    public void setReminderNew(ScheduleDTO scheduleDTO, String str) {
        try {
            ICalendarService iCalendarService = calendarService;
            if (iCalendarService == null) {
                init();
            } else {
                iCalendarService.setReminderNew(scheduleDTO, str);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService setReminder exception");
            e.printStackTrace();
        }
    }

    private void init() {
        if (calendarService == null) {
            new AsyncTask<Object, Object, Boolean>() { // from class: com.taobao.calendar.aidl.business.CalendarAidlAdapter.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public Boolean doInBackground(Object... objArr) {
                    if (CalendarAidlAdapter.calendarService == null) {
                        ICalendarService unused = CalendarAidlAdapter.calendarService = (ICalendarService) Services.get(Globals.getApplication(), ICalendarService.class);
                    }
                    return Boolean.TRUE;
                }
            }.execute(new Object());
        }
    }
}
