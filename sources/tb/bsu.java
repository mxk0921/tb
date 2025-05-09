package tb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bsu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final bsu b = new bsu();

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f16607a;

    static {
        t2o.a(404750759);
    }

    public static String a(Cursor cursor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec4b2b87", new Object[]{cursor, str});
        }
        return cursor.getString(cursor.getColumnIndex(str));
    }

    public static bsu i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsu) ipChange.ipc$dispatch("f85f8a82", new Object[0]);
        }
        return b;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.f16607a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f16607a.close();
        }
    }

    public final JSONArray d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c49d9194", new Object[]{this});
        }
        b();
        JSONArray jSONArray = new JSONArray();
        Cursor rawQuery = this.f16607a.rawQuery("select * from KVPair", null);
        while (rawQuery.moveToNext()) {
            String a2 = a(rawQuery, "key");
            String a3 = a(rawQuery, "value");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", (Object) a2);
            jSONObject.put("value", (Object) a3);
            jSONArray.add(jSONObject);
        }
        rawQuery.close();
        return jSONArray;
    }

    public final JSONArray f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ad1c0252", new Object[]{this});
        }
        b();
        JSONArray jSONArray = new JSONArray();
        Cursor rawQuery = this.f16607a.rawQuery("select * from limitIds", null);
        while (rawQuery.moveToNext()) {
            String a2 = a(rawQuery, "bizType");
            String a3 = a(rawQuery, "id");
            String a4 = a(rawQuery, "startTime");
            String a5 = a(rawQuery, "endTime");
            String a6 = a(rawQuery, "policyId");
            String a7 = a(rawQuery, "version");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizType", (Object) a2);
            jSONObject.put("id", (Object) a3);
            jSONObject.put("startTime", (Object) a4);
            jSONObject.put("endTime", (Object) a5);
            jSONObject.put("policyId", (Object) a6);
            jSONObject.put("version", (Object) a7);
            jSONArray.add(jSONObject);
        }
        rawQuery.close();
        return jSONArray;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e50160b8", new Object[]{this});
        }
        b();
        JSONObject jSONObject = new JSONObject();
        JSONArray d = d();
        JSONArray e = e();
        JSONArray f = f();
        jSONObject.put("KVPair", (Object) d);
        jSONObject.put("fatigue", (Object) e);
        jSONObject.put("limitIds", (Object) f);
        c();
        return jSONObject.toJSONString();
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3232a77e", new Object[]{this, str});
        }
        if (f82.d() == null) {
            return "";
        }
        xm1 i = xm1.i();
        return i.e("fatigue" + str);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.f16607a;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            this.f16607a = SQLiteDatabase.openDatabase(bnv.c() + "ucp_data.db", null, 1);
        }
    }

    public final JSONArray e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("38dcc9f3", new Object[]{this});
        }
        b();
        JSONArray jSONArray = new JSONArray();
        Cursor rawQuery = this.f16607a.rawQuery("select * from fatigue", null);
        while (rawQuery.moveToNext()) {
            String a2 = a(rawQuery, "createTime");
            String a3 = a(rawQuery, "actionType");
            String a4 = a(rawQuery, "bizId");
            String a5 = a(rawQuery, "schemeId");
            String a6 = a(rawQuery, "bizPlanId");
            String a7 = a(rawQuery, "materialId");
            String a8 = a(rawQuery, "materialDeliveryId");
            String a9 = a(rawQuery, "identifier");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("createTime", (Object) a2);
            jSONObject.put("actionType", (Object) a3);
            jSONObject.put("bizId", (Object) a4);
            jSONObject.put("schemeId", (Object) a5);
            jSONObject.put("bizPlanId", (Object) a6);
            jSONObject.put("materialId", (Object) a7);
            jSONObject.put("materialDeliveryId", (Object) a8);
            jSONObject.put("identifier", (Object) a9);
            jSONArray.add(jSONObject);
            jSONArray = jSONArray;
            rawQuery = rawQuery;
        }
        rawQuery.close();
        return jSONArray;
    }
}
