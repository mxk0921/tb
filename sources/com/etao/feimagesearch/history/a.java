package com.etao.feimagesearch.history;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.taobao.android.task.Coordinator;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import tb.agh;
import tb.caa;
import tb.eno;
import tb.lg4;
import tb.mld;
import tb.mno;
import tb.t2o;
import tb.yf9;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile a b = null;

    /* renamed from: a  reason: collision with root package name */
    public HistoryResult f4728a = null;

    /* compiled from: Taobao */
    /* renamed from: com.etao.feimagesearch.history.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class RunnableC0237a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0237a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            eno.a(caa.c(), "history_data");
            mld.a(caa.c());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4730a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f4730a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a.a(a.this, this.f4730a);
            if (!TextUtils.isEmpty(this.b)) {
                a.b(a.this, new File(this.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ HistoryResult c;

        public c(HistoryResult historyResult) {
            this.c = historyResult;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/history/HistoryModel$3");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            if (lg4.l0()) {
                a.this.q(this.c);
            }
            ArrayList arrayList = new ArrayList(this.c.resultData.keySet());
            if (arrayList.size() >= 50) {
                Collections.sort(arrayList);
                ListIterator listIterator = arrayList.listIterator();
                for (int size = arrayList.size(); listIterator.hasNext() && size > 49; size--) {
                    this.c.resultData.remove((Long) listIterator.next());
                    listIterator.remove();
                }
            }
            a.c(a.this, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ HistoryResult c;
        public final /* synthetic */ AuctionItemVO d;

        public d(HistoryResult historyResult, AuctionItemVO auctionItemVO) {
            this.c = historyResult;
            this.d = auctionItemVO;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/history/HistoryModel$4");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            if (lg4.l0()) {
                a.this.q(this.c);
            }
            ArrayList arrayList = new ArrayList(this.c.resultData.keySet());
            if (arrayList.size() >= 50) {
                Collections.sort(arrayList);
                ListIterator listIterator = arrayList.listIterator();
                for (int size = arrayList.size(); listIterator.hasNext() && size > 49; size--) {
                    this.c.resultData.remove((Long) listIterator.next());
                    listIterator.remove();
                }
            }
            Map<Long, AuctionItemVO> map = this.c.resultData;
            AuctionItemVO auctionItemVO = this.d;
            map.put(auctionItemVO.timeStr, auctionItemVO);
            a.c(a.this, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements FilenameFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(a aVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
            }
            try {
                return mld.e(new File(file, str));
            } catch (Exception unused) {
                return false;
            }
        }
    }

    static {
        t2o.a(481296943);
    }

    public static /* synthetic */ boolean a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f183c7f9", new Object[]{aVar, str})).booleanValue();
        }
        return aVar.s(str);
    }

    public static /* synthetic */ long b(a aVar, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ce6fd35", new Object[]{aVar, file})).longValue();
        }
        return aVar.e(file);
    }

    public static /* synthetic */ boolean c(a aVar, HistoryResult historyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c9697d5", new Object[]{aVar, historyResult})).booleanValue();
        }
        return aVar.r(historyResult);
    }

    public static a j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d34f5444", new Object[0]);
        }
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dee8e", new Object[]{this});
            return;
        }
        HistoryResult historyResult = this.f4728a;
        if (historyResult == null) {
            HistoryResult historyResult2 = new HistoryResult();
            this.f4728a = historyResult2;
            historyResult2.resultData = new HashMap();
        } else {
            historyResult.clear();
        }
        Coordinator.execute(new RunnableC0237a());
    }

    public final long e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9994c1a5", new Object[]{this, file})).longValue();
        }
        if (!mld.e(file)) {
            return 0L;
        }
        agh.h("HistoryModel", "deleteCacheFile " + file.getAbsolutePath());
        long length = file.length();
        if (yf9.b(file.getAbsolutePath())) {
            return length;
        }
        return 0L;
    }

    public void f(AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1731d05", new Object[]{this, auctionItemVO});
        } else if (auctionItemVO != null && auctionItemVO.timeStr != null) {
            if (this.f4728a == null) {
                k();
            }
            if (!this.f4728a.resultData.isEmpty()) {
                this.f4728a.resultData.remove(auctionItemVO.timeStr);
                Coordinator.execute(new b(JSON.toJSONString(this.f4728a), auctionItemVO.fileUrl));
            }
        }
    }

    public HistoryResult h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryResult) ipChange.ipc$dispatch("bb8de631", new Object[]{this});
        }
        if (this.f4728a == null) {
            k();
        }
        return this.f4728a.deepClone();
    }

    public final void k() {
        HistoryResult historyResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ff94b5", new Object[]{this});
            return;
        }
        HistoryResult historyResult2 = new HistoryResult();
        this.f4728a = historyResult2;
        historyResult2.resultData = new HashMap();
        String d2 = eno.d(caa.c(), "history_data", "");
        if (TextUtils.isEmpty(d2)) {
            agh.c("HistoryModel", "history not exist");
            return;
        }
        try {
            historyResult = (HistoryResult) JSON.parseObject(d2, HistoryResult.class);
        } catch (Exception unused) {
            agh.c("HistoryModel", "history parse error");
            historyResult = null;
        }
        if (historyResult != null && historyResult.resultData != null) {
            agh.a("HistoryModel", "history load success:count " + historyResult.resultData.size());
            this.f4728a = historyResult;
        }
    }

    public final void l(AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1860afa9", new Object[]{this, auctionItemVO});
            return;
        }
        if (this.f4728a == null) {
            k();
        }
        v(this.f4728a.deepClone(), auctionItemVO);
        ArrayList arrayList = new ArrayList(this.f4728a.resultData.keySet());
        if (arrayList.size() >= 50) {
            Collections.sort(arrayList);
            ListIterator listIterator = arrayList.listIterator();
            for (int size = arrayList.size(); listIterator.hasNext() && size > 49; size--) {
                this.f4728a.resultData.remove((Long) listIterator.next());
                listIterator.remove();
            }
        }
        this.f4728a.resultData.put(auctionItemVO.timeStr, auctionItemVO);
    }

    public AuctionItemVO m(Context context, String str, Bitmap bitmap, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionItemVO) ipChange.ipc$dispatch("a31179e3", new Object[]{this, context, str, bitmap, map});
        }
        String k = mld.k(context, bitmap, 90);
        if (TextUtils.isEmpty(k)) {
            return null;
        }
        AuctionItemVO auctionItemVO = new AuctionItemVO();
        auctionItemVO.picPath = Uri.parse(k);
        auctionItemVO.fileUrl = k;
        auctionItemVO.photofrom = str;
        auctionItemVO.mSource = Integer.valueOf(AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue());
        if (map != null) {
            auctionItemVO.mExtraJSKV = new HashMap(map);
        }
        auctionItemVO.timeStr = Long.valueOf(caa.d());
        l(auctionItemVO);
        return auctionItemVO;
    }

    public AuctionItemVO n(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionItemVO) ipChange.ipc$dispatch("57a30f95", new Object[]{this, context, str, str2, str3, map});
        }
        if (context == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        AuctionItemVO auctionItemVO = new AuctionItemVO();
        auctionItemVO.picPath = Uri.parse(str2);
        auctionItemVO.fileUrl = str3;
        auctionItemVO.photofrom = str;
        auctionItemVO.mSource = Integer.valueOf(AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue());
        if (map != null) {
            auctionItemVO.mExtraJSKV = new HashMap(map);
        }
        auctionItemVO.timeStr = Long.valueOf(caa.d());
        l(auctionItemVO);
        return auctionItemVO;
    }

    public AuctionItemVO o(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionItemVO) ipChange.ipc$dispatch("77836c1b", new Object[]{this, str, str2, map});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        AuctionItemVO auctionItemVO = new AuctionItemVO();
        auctionItemVO.picPath = Uri.parse(str2);
        auctionItemVO.fileUrl = str2;
        auctionItemVO.photofrom = str;
        auctionItemVO.mSource = Integer.valueOf(AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue());
        if (map != null) {
            auctionItemVO.mExtraJSKV = new HashMap(map);
        }
        auctionItemVO.timeStr = Long.valueOf(caa.d());
        l(auctionItemVO);
        return auctionItemVO;
    }

    public void p(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3538fa", new Object[]{this, context, str, str2, str3});
        } else if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            AuctionItemVO auctionItemVO = new AuctionItemVO();
            auctionItemVO.picPath = Uri.parse(str3);
            auctionItemVO.fileUrl = str;
            auctionItemVO.isVideo = true;
            auctionItemVO.duration = str2;
            auctionItemVO.mSource = Integer.valueOf(AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue());
            auctionItemVO.timeStr = Long.valueOf(caa.d());
            l(auctionItemVO);
        }
    }

    public long q(HistoryResult historyResult) {
        Map<Long, AuctionItemVO> map;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb69014", new Object[]{this, historyResult})).longValue();
        }
        if (historyResult == null || (map = historyResult.resultData) == null || map.isEmpty() || !lg4.l0()) {
            return 0L;
        }
        long g = g(caa.c(), historyResult);
        ArrayList arrayList = new ArrayList(historyResult.resultData.keySet());
        Collections.sort(arrayList);
        long m2 = lg4.m2();
        long d2 = caa.d();
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            Long l = (Long) listIterator.next();
            if (d2 - l.longValue() > m2) {
                i++;
                listIterator.remove();
                AuctionItemVO remove = historyResult.resultData.remove(l);
                if (remove != null) {
                    e(new File(remove.fileUrl));
                }
            }
        }
        if (i > 0) {
            r(historyResult);
        }
        long j = g + i;
        agh.h("HistoryModel", "delete file length " + j);
        return j;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4e6a27", new Object[]{this});
            return;
        }
        HistoryResult historyResult = this.f4728a;
        if (historyResult != null) {
            u(historyResult.deepClone());
        }
    }

    public final void u(HistoryResult historyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3311aa7", new Object[]{this, historyResult});
        } else {
            Coordinator.execute(new c(historyResult));
        }
    }

    public final void v(HistoryResult historyResult, AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae172e4", new Object[]{this, historyResult, auctionItemVO});
        } else if (lg4.d0()) {
            Coordinator.execute(new d(historyResult, auctionItemVO));
        }
    }

    public final boolean r(HistoryResult historyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73e5605f", new Object[]{this, historyResult})).booleanValue();
        }
        try {
            mno.h(caa.c(), "history_data", JSON.toJSONString(historyResult));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }

    public final boolean s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1668a4c1", new Object[]{this, str})).booleanValue();
        }
        try {
            mno.h(caa.c(), "history_data", str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }

    public final long g(Context context, HistoryResult historyResult) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d84f1b15", new Object[]{this, context, historyResult})).longValue();
        }
        if (!lg4.e0()) {
            return 0L;
        }
        try {
            File[] listFiles = context.getCacheDir().listFiles(new e(this));
            if (listFiles == null) {
                return 0L;
            }
            HashSet hashSet = new HashSet(historyResult.resultData.size());
            for (AuctionItemVO auctionItemVO : historyResult.resultData.values()) {
                Uri uri = auctionItemVO.picPath;
                if (uri != null) {
                    String uri2 = uri.toString();
                    hashSet.add(uri2);
                    agh.h("HistoryModel", "path = " + uri2);
                }
            }
            int length = listFiles.length;
            int i2 = 0;
            while (i < length) {
                try {
                    File file = listFiles[i];
                    if (!hashSet.contains(file.getAbsolutePath())) {
                        i2 = (int) (i2 + e(file));
                    }
                    i++;
                } catch (Exception unused) {
                    i = i2;
                    return i;
                }
            }
            return i2;
        } catch (Exception unused2) {
        }
    }

    public HistoryResult i(String str, boolean z, int i) {
        Integer num;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryResult) ipChange.ipc$dispatch("631bdd83", new Object[]{this, str, new Boolean(z), new Integer(i)});
        }
        if (this.f4728a == null) {
            k();
        }
        if (this.f4728a.resultData.isEmpty()) {
            return this.f4728a;
        }
        if (i <= 0) {
            i = 50;
        }
        if (TextUtils.isEmpty(str)) {
            str = "all";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(this.f4728a.resultData.keySet());
        if (z) {
            Collections.sort(arrayList);
        } else {
            Collections.sort(arrayList, Collections.reverseOrder());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Long l = (Long) arrayList.get(i3);
            AuctionItemVO auctionItemVO = this.f4728a.resultData.get(l);
            if (i2 >= i) {
                break;
            }
            if (!(auctionItemVO == null || (num = auctionItemVO.mSource) == null || num.intValue() == AuctionItemVO.ItemSource.REMOTE_TFS.getValue())) {
                if (auctionItemVO.mSource.intValue() == AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue()) {
                    if (TextUtils.isEmpty(auctionItemVO.fileUrl)) {
                        str2 = auctionItemVO.picPath.toString();
                    } else {
                        str2 = auctionItemVO.fileUrl;
                    }
                    if (auctionItemVO.picPath != null) {
                        if (!yf9.d(str2)) {
                        }
                    }
                }
                AuctionItemVO deepClone = auctionItemVO.deepClone();
                if (TextUtils.equals("image", str) && !deepClone.isVideo) {
                    linkedHashMap.put(l, deepClone);
                } else if (!TextUtils.equals("video", str) || !deepClone.isVideo) {
                    linkedHashMap.put(l, deepClone);
                } else {
                    linkedHashMap.put(l, deepClone);
                }
                i2++;
            }
        }
        HistoryResult historyResult = new HistoryResult();
        historyResult.resultData = linkedHashMap;
        return historyResult;
    }
}
