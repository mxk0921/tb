package com.alipay.mobile.common.transport.httpdns.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.HttpdnsIPEntry;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.pod;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpdnsDBService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f4111a = null;
    public final HttpdnsDBManager b;

    public HttpdnsDBService(Context context) {
        this.b = HttpdnsDBManager.getInstance(context);
    }

    public final List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<String> list = this.f4111a;
        if (list != null && !list.isEmpty()) {
            return this.f4111a;
        }
        ArrayList arrayList = new ArrayList(3);
        this.f4111a = arrayList;
        arrayList.add(DnsUtil.getAmdcHost());
        this.f4111a.add("mugw.alipay.com");
        this.f4111a.add("mdgw.alipay.com");
        return this.f4111a;
    }

    public synchronized void clearHttpdnsOriginal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc25c48c", new Object[]{this});
            return;
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        writableDatabase.execSQL(HttpdnsDBSql.clearHttpdns);
        writableDatabase.close();
    }

    public synchronized void removeIpInfoFromDB(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1115baf2", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            LogCatUtil.debug("HDNS_HttpdnsDBService", "removeIpInfoFromDB : host is null");
        } else {
            this.b.getWritableDatabase().execSQL(HttpdnsDBSql.REMOVEIPINFOFROMDB_INGORE_NETTYPE, new String[]{str});
        }
    }

    public synchronized void removeSingleIpInfoFromDB(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ec1df", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        try {
        } catch (Exception e) {
            LogCatUtil.warn("HDNS_HttpdnsDBService", "removeSingleIpInfoFromDB ex: " + e.toString());
        }
        if (!TextUtils.isEmpty(str)) {
            this.b.getWritableDatabase().execSQL(HttpdnsDBSql.removeSingleIpInfoFromDB, new String[]{str, String.valueOf(str2), String.valueOf(i)});
            LogCatUtil.info("HDNS_HttpdnsDBService", "removeSingleIpInfoFromDB,host: " + str + ",ip:" + str2 + ",remove success");
        }
    }

    public final boolean b(SQLiteDatabase sQLiteDatabase, Map.Entry<String, HttpDns.HttpdnsIP> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfe66da", new Object[]{this, sQLiteDatabase, entry})).booleanValue();
        }
        if (!a().contains(entry.getKey())) {
            return false;
        }
        if (isHostInDBIngoreNetType(entry.getKey())) {
            removeIpInfoFromDB(entry.getKey());
        }
        sQLiteDatabase.beginTransaction();
        for (int i = 1; i <= 4; i++) {
            try {
                HttpdnsIPEntry[] ipEntries = entry.getValue().getIpEntries();
                for (int i2 = 0; i2 < ipEntries.length; i2++) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("domain", entry.getKey());
                    contentValues.put(pod.IP, ipEntries[i2].ip);
                    contentValues.put("ipType", Integer.valueOf(ipEntries[i2].ipType));
                    contentValues.put("port", Integer.valueOf(ipEntries[i2].port));
                    contentValues.put("time", Long.valueOf(entry.getValue().getTime()));
                    contentValues.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                    contentValues.put("netType", Integer.valueOf(i));
                    contentValues.put("ttd", (Integer) 21);
                    sQLiteDatabase.insert("httpdns", null, contentValues);
                }
            } catch (Throwable th) {
                try {
                    LogCatUtil.error("HDNS_HttpdnsDBService", "processAmdc ex:" + th.toString());
                    return false;
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
        }
        sQLiteDatabase.setTransactionSuccessful();
        return true;
    }

    public synchronized void insertIpinfo2DB(String str, HttpDns.HttpdnsIP httpdnsIP, int i) {
        Throwable th;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6c1f2c4", new Object[]{this, str, httpdnsIP, new Integer(i)});
                return;
            }
            SQLiteDatabase sQLiteDatabase = null;
            try {
                LogCatUtil.debug("HDNS_HttpdnsDBService", "insertIpinfo2DB,hostName : " + str + " ,ipInfo : " + httpdnsIP.toString());
                if (isHostInDB(str, i)) {
                    removeIpInfoFromDB(str, i);
                }
                SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                try {
                    if (!TextUtils.isEmpty(httpdnsIP.getCname())) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("domain", str);
                        contentValues.put("time", Long.valueOf(httpdnsIP.getTime()));
                        contentValues.put(RemoteMessageConst.TTL, Long.valueOf(httpdnsIP.getTtl()));
                        contentValues.put("netType", Integer.valueOf(i));
                        contentValues.put("cname", httpdnsIP.getCname());
                        contentValues.put("ttd", Integer.valueOf(httpdnsIP.getTtd()));
                        writableDatabase.insert("httpdns", null, contentValues);
                    } else {
                        HttpdnsIPEntry[] ipEntries = httpdnsIP.getIpEntries();
                        for (int i2 = 0; i2 < ipEntries.length; i2++) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("domain", str);
                            contentValues2.put(pod.IP, ipEntries[i2].ip);
                            contentValues2.put("ipType", Integer.valueOf(ipEntries[i2].ipType));
                            contentValues2.put("port", Integer.valueOf(ipEntries[i2].port));
                            contentValues2.put("time", Long.valueOf(httpdnsIP.getTime()));
                            contentValues2.put(RemoteMessageConst.TTL, Long.valueOf(httpdnsIP.getTtl()));
                            contentValues2.put("netType", Integer.valueOf(i));
                            contentValues2.put("ttd", Integer.valueOf(httpdnsIP.getTtd()));
                            writableDatabase.insert("httpdns", null, contentValues2);
                        }
                    }
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                    LogCatUtil.debug("HDNS_HttpdnsDBService", "insertIpinfo2DB ex:" + th.toString());
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public boolean isHostInDB(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e261d981", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        Cursor cursor = null;
        try {
            if (TextUtils.isEmpty(str)) {
                LogCatUtil.debug("HDNS_HttpdnsDBService", "isHostInDB : host is null");
                return false;
            }
            Cursor rawQuery = this.b.getWritableDatabase().rawQuery(HttpdnsDBSql.isHostInDB, new String[]{str, String.valueOf(i)});
            if (rawQuery.getCount() <= 0) {
                rawQuery.close();
                return false;
            }
            rawQuery.close();
            return true;
        } catch (Throwable th) {
            try {
                LogCatUtil.warn("HDNS_HttpdnsDBService", "isHostInDB ex : " + th.toString());
                return false;
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
    }

    public boolean isHostInDBIngoreNetType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83577037", new Object[]{this, str})).booleanValue();
        }
        Cursor cursor = null;
        try {
            if (TextUtils.isEmpty(str)) {
                LogCatUtil.debug("HDNS_HttpdnsDBService", "isHostInDBIngoreNetType : host is null");
                return false;
            }
            Cursor rawQuery = this.b.getWritableDatabase().rawQuery(HttpdnsDBSql.ISHOSTINDB_INGORE_NETTYPE, new String[]{str});
            if (rawQuery.getCount() <= 0) {
                rawQuery.close();
                return false;
            }
            rawQuery.close();
            return true;
        } catch (Throwable th) {
            try {
                LogCatUtil.warn("HDNS_HttpdnsDBService", "isHostInDBIngoreNetType ex: " + th.toString());
                return false;
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
    }

    public synchronized void storeIp2DB(Map<String, HttpDns.HttpdnsIP> map, int i) {
        Throwable th;
        SQLiteDatabase writableDatabase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4462f7ed", new Object[]{this, map, new Integer(i)});
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = this.b.getWritableDatabase();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            for (Map.Entry<String, HttpDns.HttpdnsIP> entry : map.entrySet()) {
                if (!b(writableDatabase, entry)) {
                    if (isHostInDB(entry.getKey(), i)) {
                        removeIpInfoFromDB(entry.getKey(), i);
                    }
                    if (!TextUtils.isEmpty(entry.getValue().getCname())) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("domain", entry.getKey());
                        contentValues.put("time", Long.valueOf(entry.getValue().getTime()));
                        contentValues.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                        contentValues.put("netType", Integer.valueOf(i));
                        contentValues.put("cname", entry.getValue().getCname());
                        contentValues.put("ttd", Integer.valueOf(entry.getValue().getTtd()));
                        writableDatabase.insert("httpdns", null, contentValues);
                    } else {
                        HttpdnsIPEntry[] ipEntries = entry.getValue().getIpEntries();
                        for (int i2 = 0; i2 < ipEntries.length; i2++) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("domain", entry.getKey());
                            contentValues2.put(pod.IP, ipEntries[i2].ip);
                            contentValues2.put("ipType", Integer.valueOf(ipEntries[i2].ipType));
                            contentValues2.put("port", Integer.valueOf(ipEntries[i2].port));
                            contentValues2.put("time", Long.valueOf(entry.getValue().getTime()));
                            contentValues2.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                            contentValues2.put("netType", Integer.valueOf(i));
                            contentValues2.put("ttd", Integer.valueOf(entry.getValue().getTtd()));
                            writableDatabase.insert("httpdns", null, contentValues2);
                        }
                    }
                }
            }
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = writableDatabase;
            LogCatUtil.error("HDNS_HttpdnsDBService", "storeIp2DB ex:" + th.toString());
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
        }
    }

    public synchronized void updateIp2DB(Map<String, HttpDns.HttpdnsIP> map, int i) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f5ed05", new Object[]{this, map, new Integer(i)});
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = null;
            for (Map.Entry<String, HttpDns.HttpdnsIP> entry : map.entrySet()) {
                try {
                    if (isHostInDB(entry.getKey(), i)) {
                        removeIpInfoFromDB(entry.getKey(), i);
                    }
                    sQLiteDatabase2 = this.b.getWritableDatabase();
                    if (!TextUtils.isEmpty(entry.getValue().getCname())) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("domain", entry.getKey());
                        contentValues.put("time", Long.valueOf(entry.getValue().getTime()));
                        contentValues.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                        contentValues.put("netType", Integer.valueOf(i));
                        contentValues.put("cname", entry.getValue().getCname());
                        contentValues.put("ttd", Integer.valueOf(entry.getValue().getTtd()));
                        sQLiteDatabase2.insert("httpdns", null, contentValues);
                    } else {
                        HttpdnsIPEntry[] ipEntries = entry.getValue().getIpEntries();
                        for (int i2 = 0; i2 < ipEntries.length; i2++) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("domain", entry.getKey());
                            contentValues2.put(pod.IP, ipEntries[i2].ip);
                            contentValues2.put("ipType", Integer.valueOf(ipEntries[i2].ipType));
                            contentValues2.put("port", Integer.valueOf(ipEntries[i2].port));
                            contentValues2.put("time", Long.valueOf(entry.getValue().getTime()));
                            contentValues2.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                            contentValues2.put("netType", Integer.valueOf(i));
                            contentValues2.put("ttd", Integer.valueOf(entry.getValue().getTtd()));
                            sQLiteDatabase2.insert("httpdns", null, contentValues2);
                        }
                    }
                    LogCatUtil.debug("HDNS_HttpdnsDBService", "updateIp2DB hostName = " + entry.getKey());
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabase2;
                    LogCatUtil.warn("HDNS_HttpdnsDBService", "updateIp2DB ex :" + th.toString());
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                }
            }
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x012f A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000f, B:10:0x0028, B:25:0x0105, B:34:0x012f, B:36:0x0134, B:32:0x0113), top: B:41:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0134 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000f, B:10:0x0028, B:25:0x0105, B:34:0x012f, B:36:0x0134, B:32:0x0113), top: B:41:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.Map<java.lang.String, com.alipay.mobile.common.transport.httpdns.HttpDns.HttpdnsIP> getAllIPFromDB(int r18) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.httpdns.db.HttpdnsDBService.getAllIPFromDB(int):java.util.Map");
    }

    public synchronized HttpDns.HttpdnsIP queryIpInfoFromDB(String str, int i) {
        Cursor cursor;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("21f62db5", new Object[]{this, str, new Integer(i)});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                try {
                    LogCatUtil.debug("HDNS_HttpdnsDBService", "queryIpInfpFromDB : domain is null");
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
            } else {
                HashMap hashMap = new HashMap();
                cursor = this.b.getReadableDatabase().rawQuery(HttpdnsDBSql.queryIpInfoFromDB, new String[]{str, String.valueOf(i)});
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(pod.IP));
                        int i2 = cursor.getInt(cursor.getColumnIndex("ipType"));
                        int i3 = cursor.getInt(cursor.getColumnIndex("port"));
                        long j = cursor.getLong(cursor.getColumnIndex("time"));
                        long j2 = cursor.getLong(cursor.getColumnIndex(RemoteMessageConst.TTL));
                        String string2 = cursor.getString(cursor.getColumnIndex("cname"));
                        int i4 = cursor.getInt(cursor.getColumnIndex("ttd"));
                        HttpDns.HttpdnsIP httpdnsIP = new HttpDns.HttpdnsIP();
                        httpdnsIP.setTime(j);
                        httpdnsIP.setTtl(j2);
                        httpdnsIP.setNetType(i);
                        httpdnsIP.setTtd(i4);
                        if (!TextUtils.isEmpty(string2)) {
                            httpdnsIP.setCname(string2);
                            hashMap.put(str, httpdnsIP);
                        } else {
                            HttpdnsIPEntry httpdnsIPEntry = new HttpdnsIPEntry(string, i2, i3);
                            httpdnsIP.setIp(string);
                            httpdnsIP.setIpEntries(new HttpdnsIPEntry[]{httpdnsIPEntry});
                            if (hashMap.get(str) != null) {
                                httpdnsIP = DnsUtil.mergerHttpdnsIp((HttpDns.HttpdnsIP) hashMap.get(str), httpdnsIP);
                            }
                            hashMap.put(str, httpdnsIP);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                HttpDns.HttpdnsIP httpdnsIP2 = (HttpDns.HttpdnsIP) hashMap.get(str);
                cursor.close();
                return httpdnsIP2;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        LogCatUtil.error("HDNS_HttpdnsDBService", "queryIpInfpFromDB ex:", th);
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public synchronized void removeIpInfoFromDB(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a21651", new Object[]{this, str, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
            LogCatUtil.debug("HDNS_HttpdnsDBService", "removeIpInfoFromDB : host is null");
        } else {
            this.b.getWritableDatabase().execSQL(HttpdnsDBSql.removeIpInfoFromDB, new String[]{str, String.valueOf(i)});
        }
    }
}
