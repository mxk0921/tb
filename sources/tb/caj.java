package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.monitor.MultiPathFlowStatistic;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class caj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f16938a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final caj f16939a = new caj();

        public static /* synthetic */ caj a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (caj) ipChange.ipc$dispatch("8e2c0674", new Object[0]);
            }
            return f16939a;
        }
    }

    public static caj c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (caj) ipChange.ipc$dispatch("ec937dce", new Object[0]);
        }
        return b.a();
    }

    public final void a(HashMap<String, HashMap<String, Double>> hashMap, int i) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbacfa8", new Object[]{this, hashMap, new Integer(i)});
            return;
        }
        for (String str : hashMap.keySet()) {
            MultiPathFlowStatistic multiPathFlowStatistic = new MultiPathFlowStatistic();
            multiPathFlowStatistic.date = str;
            HashMap<String, Double> hashMap2 = hashMap.get(str);
            JSONObject jSONObject = new JSONObject();
            double d = vu3.b.GEO_NOT_SUPPORT;
            for (String str2 : hashMap2.keySet()) {
                double doubleValue = hashMap2.get(str2).doubleValue();
                jSONObject.put(str2, doubleValue);
                d += doubleValue;
            }
            multiPathFlowStatistic.ipList = jSONObject.toString();
            multiPathFlowStatistic.dayFlowSize = d;
            multiPathFlowStatistic.flowType = i;
            AppMonitor.getInstance().commitStat(multiPathFlowStatistic);
        }
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        SQLiteDatabase writableDatabase = new daj(context, daj.DATABASE_NAME).getWritableDatabase();
        this.f16938a = writableDatabase;
        if (writableDatabase != null) {
            b();
        }
    }

    public caj() {
    }

    public final void b() {
        int i;
        Exception e;
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c6b5f9", new Object[]{this});
            return;
        }
        int i3 = 0;
        while (i3 <= i2) {
            Cursor query = this.f16938a.query(daj.MULTI_PATH_FLOW_TASK_TABLE_NAME, null, "flowType = ?", new String[]{String.valueOf(i3)}, null, null, null);
            if (query != null && query.getCount() > 0) {
                try {
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String format = simpleDateFormat.format(new Date());
                        int columnIndex = query.getColumnIndex("date");
                        int columnIndex2 = query.getColumnIndex("useFlowSize");
                        int columnIndex3 = query.getColumnIndex(AgooConstants.MESSAGE_FLAG);
                        HashMap<String, HashMap<String, Double>> hashMap = new HashMap<>();
                        while (query.moveToNext()) {
                            String string = query.getString(columnIndex);
                            Calendar instance = Calendar.getInstance();
                            try {
                                instance.setTime(new Date());
                                instance.add(5, -8);
                                if (string.compareTo(simpleDateFormat.format(instance.getTime())) <= 0 && this.f16938a.delete(daj.MULTI_PATH_FLOW_TASK_TABLE_NAME, "date = ?", new String[]{string}) <= 0) {
                                    ALog.i("falco.MultiPathFlowDb", "delete table flag failed", null, "date", string);
                                }
                                if (format.equals(string) || (!format.equals(string) && 1 == query.getInt(columnIndex3))) {
                                    columnIndex = columnIndex;
                                    i2 = 2;
                                } else {
                                    String string2 = query.getString(query.getColumnIndex("host"));
                                    HashMap<String, Double> hashMap2 = new HashMap<>();
                                    boolean z = false;
                                    for (String str : hashMap.keySet()) {
                                        if (str.equals(string)) {
                                            hashMap2 = hashMap.get(str);
                                            hashMap2.put(string2, Double.valueOf(query.getDouble(columnIndex2)));
                                            hashMap.put(string, hashMap2);
                                            z = true;
                                        }
                                        simpleDateFormat = simpleDateFormat;
                                    }
                                    if (!z) {
                                        hashMap2.put(string2, Double.valueOf(query.getDouble(columnIndex2)));
                                        hashMap.put(string, hashMap2);
                                    }
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put(AgooConstants.MESSAGE_FLAG, (Integer) 1);
                                    if (this.f16938a.update(daj.MULTI_PATH_FLOW_TASK_TABLE_NAME, contentValues, "date = ? and host = ?", new String[]{string, string2}) <= 0) {
                                        i2 = 2;
                                        if (ALog.isPrintLog(2)) {
                                            ALog.i("falco.MultiPathFlowDb", "update table flag failed", null, "date", string);
                                        }
                                    } else {
                                        i2 = 2;
                                    }
                                    columnIndex = columnIndex;
                                    simpleDateFormat = simpleDateFormat;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i2 = 2;
                                ALog.e("falco.MultiPathFlowDb", "dbStatistic failed", null, e, new Object[0]);
                                query.close();
                                i = 1;
                                i3 += i;
                            }
                        }
                        a(hashMap, i3);
                        query.close();
                        i = 1;
                    } catch (Exception e3) {
                        e = e3;
                    }
                    i3 += i;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            i = 1;
            i3 += i;
        }
    }

    public void e(double d, String str, int i) {
        double d2 = d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a05cf95", new Object[]{this, new Double(d2), str, new Integer(i)});
            return;
        }
        ALog.d("falco.MultiPathFlowDb", "start update db data", null, new Object[0]);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Cursor query = this.f16938a.query(daj.MULTI_PATH_FLOW_TASK_TABLE_NAME, null, "date = ? and host = ? and flowType = ?", new String[]{format, str, String.valueOf(i)}, null, null, null);
        if (query == null || query.getCount() <= 0) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("flowType", Integer.valueOf(i));
                contentValues.put("date", format);
                contentValues.put("useFlowSize", Double.valueOf(d));
                contentValues.put("host", str);
                contentValues.put(AgooConstants.MESSAGE_FLAG, (Integer) 0);
                if (this.f16938a.insert(daj.MULTI_PATH_FLOW_TASK_TABLE_NAME, null, contentValues) == -1 && ALog.isPrintLog(2)) {
                    ALog.i("falco.MultiPathFlowDb", "insert table failed", null, "date", format);
                }
                ALog.d("falco.MultiPathFlowDb", "insert db data success", null, new Object[0]);
            } catch (Exception e) {
                ALog.e("falco.MultiPathFlowDb", "first insert utdid, doOperation failed", null, e, new Object[0]);
            }
        } else {
            try {
                try {
                    int columnIndex = query.getColumnIndex("date");
                    int columnIndex2 = query.getColumnIndex("useFlowSize");
                    while (query.moveToNext()) {
                        if (format.equals(query.getString(columnIndex))) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("useFlowSize", Double.valueOf(query.getDouble(columnIndex2) + d2));
                            if (this.f16938a.update(daj.MULTI_PATH_FLOW_TASK_TABLE_NAME, contentValues2, "date = ? and host = ? and flowType = ?", new String[]{format, str, String.valueOf(i)}) <= 0 && ALog.isPrintLog(2)) {
                                ALog.i("falco.MultiPathFlowDb", "update table failed", null, "date", format);
                            }
                            ALog.d("falco.MultiPathFlowDb", "update db data success", null, new Object[0]);
                            d2 = d;
                        }
                    }
                } catch (Exception e2) {
                    ALog.e("falco.MultiPathFlowDb", "no first insert utdid, doOperation failed", null, e2, new Object[0]);
                }
                query.close();
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }
}
