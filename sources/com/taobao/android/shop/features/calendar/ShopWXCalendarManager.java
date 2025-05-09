package com.taobao.android.shop.features.calendar;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopWXCalendarManager extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ADD_TYPE = 1;
    private static final String BIZ_ID = "businessId";
    private static final int CANCEL_TYPE = 2;
    private static final int CHECK_TYPE = 0;
    private static final String END_TIME = "endTime";
    private static final String LINK = "link";
    private static final String REMIND = "remind";
    private static final String SOURCE_ID = "sourceId";
    private static final String START_TIME = "startTime";
    private static final String SUCCESS = "success";
    private static String TAG = "ShopWXCalendarManager";
    private static final String TITLE = "title";
    private CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
    private final HashMap<String, a> infoMap = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9403a;
        public final String b;
        public final String c;

        static {
            t2o.a(764411959);
        }

        public a(int i, String str, String str2, String str3) {
            this.f9403a = i;
            this.b = str2;
            this.c = str3;
        }
    }

    static {
        t2o.a(764411957);
    }

    public static /* synthetic */ HashMap access$000(ShopWXCalendarManager shopWXCalendarManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("64d04a9a", new Object[]{shopWXCalendarManager});
        }
        return shopWXCalendarManager.infoMap;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.calendarAidlAdapter.init(Globals.getApplication());
        this.calendarAidlAdapter.registerListener(new CalendarListener() { // from class: com.taobao.android.shop.features.calendar.ShopWXCalendarManager.1
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.taobao.calendar.aidl.listener.CalendarListener
            public void onError(String str, String str2) throws RemoteException {
                HashMap hashMap = new HashMap();
                ShopWXCalendarManager shopWXCalendarManager = ShopWXCalendarManager.this;
                a aVar = (a) ShopWXCalendarManager.access$000(shopWXCalendarManager).get(str2);
                if (aVar != null) {
                    hashMap.put("success", Boolean.FALSE);
                    hashMap.put("businessId", aVar.b);
                    String str3 = aVar.c;
                    int i = aVar.f9403a;
                    if (i == 1) {
                        WXSDKManager.getInstance().callback(shopWXCalendarManager.mWXSDKInstance.N(), str3, hashMap);
                    } else if (i == 2) {
                        WXSDKManager.getInstance().callback(shopWXCalendarManager.mWXSDKInstance.N(), str3, hashMap);
                    }
                }
            }

            @Override // com.taobao.calendar.aidl.listener.CalendarListener
            public void onSuccess(boolean z, String str, String[] strArr) throws RemoteException {
                HashMap hashMap = new HashMap();
                ShopWXCalendarManager shopWXCalendarManager = ShopWXCalendarManager.this;
                a aVar = (a) ShopWXCalendarManager.access$000(shopWXCalendarManager).get(str);
                if (aVar != null) {
                    hashMap.put("success", Boolean.valueOf(z));
                    hashMap.put("businessId", aVar.b);
                    String str2 = aVar.c;
                    int i = aVar.f9403a;
                    if (i != 0) {
                        if (i == 1) {
                            WXSDKManager.getInstance().callback(shopWXCalendarManager.mWXSDKInstance.N(), str2, hashMap);
                        } else if (i == 2) {
                            WXSDKManager.getInstance().callback(shopWXCalendarManager.mWXSDKInstance.N(), str2, hashMap);
                        }
                    } else if (z) {
                        WXSDKManager.getInstance().callback(shopWXCalendarManager.mWXSDKInstance.N(), str2, hashMap);
                    }
                }
            }
        });
    }

    public static /* synthetic */ Object ipc$super(ShopWXCalendarManager shopWXCalendarManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/features/calendar/ShopWXCalendarManager");
    }

    @WXModuleAnno
    public void addReminder(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79983f4e", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(Login.getUserId())) {
            Login.login(true);
        } else {
            try {
                ScheduleDTO scheduleDTO = new ScheduleDTO();
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("businessId");
                scheduleDTO.setSourceId(jSONObject.optInt("sourceId"));
                String optString2 = jSONObject.optString("link");
                if (!TextUtils.isEmpty(optString2)) {
                    scheduleDTO.setLink(optString2);
                }
                String optString3 = jSONObject.optString("startTime");
                if (!TextUtils.isEmpty(optString3)) {
                    scheduleDTO.setStartTime(optString3);
                }
                String optString4 = jSONObject.optString(END_TIME);
                if (!TextUtils.isEmpty(optString4)) {
                    scheduleDTO.setEndTime(optString4);
                }
                String optString5 = jSONObject.optString("title");
                if (!TextUtils.isEmpty(optString5)) {
                    scheduleDTO.setTitle(optString5);
                }
                scheduleDTO.setRemind(jSONObject.optInt(REMIND));
                if (!TextUtils.isEmpty(Login.getUserId()) && !TextUtils.isEmpty(optString)) {
                    String str3 = Login.getUserId() + "_" + optString;
                    scheduleDTO.setEventId(str3);
                    init();
                    this.infoMap.put(str3, new a(1, str3, optString, str2));
                    this.calendarAidlAdapter.setReminder(scheduleDTO);
                }
            } catch (JSONException e) {
                Log.e(TAG, "json parse error", e);
            }
        }
    }

    @WXModuleAnno
    public void checkReminder(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08fa1b5", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(Login.getUserId())) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("businessId");
                int optInt = jSONObject.optInt("sourceId");
                if (TextUtils.isEmpty(Login.getUserId()) || TextUtils.isEmpty(optString)) {
                    str3 = null;
                } else {
                    str3 = Login.getUserId() + "_" + optString;
                }
                if (!TextUtils.isEmpty(str3)) {
                    init();
                    this.infoMap.put(str3, new a(0, str3, optString, str2));
                    this.calendarAidlAdapter.checkReminderExist(optInt, str3);
                }
            } catch (JSONException e) {
                Log.e(TAG, "json parse error", e);
            }
        }
    }

    @WXModuleAnno
    public void cancelReminder(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d967f27", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(Login.getUserId())) {
            Login.login(true);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("businessId");
                int optInt = jSONObject.optInt("sourceId");
                if (!TextUtils.isEmpty(Login.getUserId()) && !TextUtils.isEmpty(optString)) {
                    String str3 = Login.getUserId() + "_" + optString;
                    this.infoMap.put(str3, new a(2, str3, optString, str2));
                    init();
                    this.calendarAidlAdapter.cancelReminder(optInt, str3);
                }
            } catch (JSONException e) {
                Log.e(TAG, "json parse error", e);
            }
        }
    }
}
