package com.meizu.cloud.pushsdk.f.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.f.c.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5870a = "a";
    private SQLiteDatabase b;
    private final b c;
    private final String[] d = {"id", "eventData", "dateCreated"};
    private long e = -1;
    private final int f;

    public a(Context context, int i) {
        this.c = b.a(context, a(context));
        e();
        this.f = i;
    }

    private String a(Context context) {
        String str = null;
        try {
            str = (String) Class.forName("com.meizu.cloud.utils.ProcessUtils").getDeclaredMethod("getCurrentProcessName", Context.class).invoke(null, context);
        } catch (Exception e) {
            String str2 = f5870a;
            DebugLogger.e(str2, "getCurrentProcessName error " + e.getMessage());
        }
        if (TextUtils.isEmpty(str)) {
            return "PushEvents.db";
        }
        return str + "_PushEvents.db";
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public long b() {
        if (d()) {
            return DatabaseUtils.queryNumEntries(this.b, "events");
        }
        return 0L;
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public c c() {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        for (Map<String, Object> map : a(this.f)) {
            com.meizu.cloud.pushsdk.f.b.c cVar = new com.meizu.cloud.pushsdk.f.b.c();
            cVar.a((Map) map.get("eventData"));
            linkedList.add((Long) map.get("id"));
            arrayList.add(cVar);
        }
        return new c(arrayList, linkedList);
    }

    public boolean d() {
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return false;
        }
        return true;
    }

    public void e() {
        if (!d()) {
            try {
                SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
                this.b = writableDatabase;
                writableDatabase.enableWriteAheadLogging();
            } catch (Exception e) {
                String str = f5870a;
                com.meizu.cloud.pushsdk.f.g.c.b(str, " open database error " + e.getMessage(), new Object[0]);
            }
        }
    }

    public List<Map<String, Object>> a(int i) {
        return a(null, "id ASC LIMIT " + i);
    }

    public long b(com.meizu.cloud.pushsdk.f.b.a aVar) {
        if (d()) {
            byte[] a2 = a(aVar.a());
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("eventData", a2);
            this.e = this.b.insert("events", null, contentValues);
        }
        String str = f5870a;
        com.meizu.cloud.pushsdk.f.g.c.a(str, "Added event to database: " + this.e, new Object[0]);
        return this.e;
    }

    public List<Map<String, Object>> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (d()) {
            Cursor query = this.b.query("events", this.d, str, null, null, null, str2);
            query.moveToFirst();
            while (!query.isAfterLast()) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("id", Long.valueOf(query.getLong(0)));
                hashMap.put("eventData", a(query.getBlob(1)));
                hashMap.put("dateCreated", query.getString(2));
                query.moveToNext();
                arrayList.add(hashMap);
            }
            query.close();
        }
        return arrayList;
    }

    public static Map<String, String> a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            HashMap hashMap = (HashMap) objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return hashMap;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public void a(com.meizu.cloud.pushsdk.f.b.a aVar) {
        b(aVar);
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public boolean a() {
        return d();
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public boolean a(long j) {
        int i;
        if (d()) {
            SQLiteDatabase sQLiteDatabase = this.b;
            i = sQLiteDatabase.delete("events", "id=" + j, null);
        } else {
            i = -1;
        }
        String str = f5870a;
        com.meizu.cloud.pushsdk.f.g.c.a(str, "Removed event from database: " + j, new Object[0]);
        return i == 1;
    }

    public static byte[] a(Map<String, String> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
