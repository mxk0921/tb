package com.taobao.message.kit.util;

import android.os.Build;
import android.os.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.ssq;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/taobao/message/kit/util/GcUtil;", "", "<init>", "()V", "Lcom/taobao/monitor/procedure/IPage;", "page", "Ltb/xhv;", "beginRecord", "(Lcom/taobao/monitor/procedure/IPage;)V", "", "pageSession", "endRecord", "(Ljava/lang/String;)V", "record", "Lcom/taobao/message/kit/util/Record;", "getCurrentBlockingGcRecord", "()Lcom/taobao/message/kit/util/Record;", "", "pages", "Ljava/util/Map;", "beginRecords", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class GcUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final GcUtil INSTANCE = new GcUtil();
    private static final Map<String, IPage> pages = new LinkedHashMap();
    private static final Map<String, Record> beginRecords = new LinkedHashMap();

    static {
        t2o.a(529531004);
    }

    private GcUtil() {
    }

    @JvmStatic
    public static final void beginRecord(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c1921c", new Object[]{iPage});
            return;
        }
        ckf.h(iPage, "page");
        Map<String, IPage> map = pages;
        String b = iPage.b();
        ckf.c(b, "page.pageSession");
        map.put(b, iPage);
        Map<String, Record> map2 = beginRecords;
        String b2 = iPage.b();
        ckf.c(b2, "page.pageSession");
        map2.put(b2, INSTANCE.getCurrentBlockingGcRecord());
    }

    @JvmStatic
    public static final void endRecord(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80173a9d", new Object[]{str});
            return;
        }
        ckf.h(str, "pageSession");
        pages.remove(str);
        beginRecords.remove(str);
    }

    private final Record getCurrentBlockingGcRecord() {
        String runtimeStat;
        String runtimeStat2;
        long j;
        Long o;
        Integer m;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Record) ipChange.ipc$dispatch("f1571d6f", new Object[]{this});
        }
        Record record = new Record();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                runtimeStat = Debug.getRuntimeStat("art.gc.blocking-gc-count");
                if (!(runtimeStat == null || (m = ssq.m(runtimeStat)) == null)) {
                    i = m.intValue();
                }
                record.setBlockingGcCount(i);
                runtimeStat2 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
                if (runtimeStat2 == null || (o = ssq.o(runtimeStat2)) == null) {
                    j = 0;
                } else {
                    j = o.longValue();
                }
                record.setBlockingGcTime(j);
            }
        } catch (Throwable unused) {
        }
        return record;
    }

    @JvmStatic
    public static final void record(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428d8d13", new Object[]{iPage});
            return;
        }
        ckf.h(iPage, "page");
        String b = iPage.b();
        ckf.c(b, "page.pageSession");
        record(b);
    }

    @JvmStatic
    public static final void record(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfa2422", new Object[]{str});
            return;
        }
        ckf.h(str, "pageSession");
        IPage iPage = pages.get(str);
        if (iPage != null) {
            TraceUtil.beginSection("gcRecord");
            Map<String, Record> map = beginRecords;
            Record record = map.get(str);
            if (record == null) {
                record = new Record();
            }
            map.put(str, record);
            Record currentBlockingGcRecord = INSTANCE.getCurrentBlockingGcRecord();
            iPage.d().a("page-blocking-gc-count", Integer.valueOf(currentBlockingGcRecord.getBlockingGcCount() - record.getBlockingGcCount()));
            iPage.d().a("page-blocking-gc-time", Long.valueOf(currentBlockingGcRecord.getBlockingGcTime() - record.getBlockingGcTime()));
            TraceUtil.endTrace();
        }
    }

    @JvmStatic
    public static final void endRecord(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dae1ace", new Object[]{iPage});
            return;
        }
        ckf.h(iPage, "page");
        String b = iPage.b();
        ckf.c(b, "page.pageSession");
        endRecord(b);
    }
}
