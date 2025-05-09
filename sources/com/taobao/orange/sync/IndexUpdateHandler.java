package com.taobao.orange.sync;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.cw0;
import tb.fck;
import tb.gr1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class IndexUpdateHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "IndexUpdateHandler";

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f11401a = 0;
    public static final boolean b = true;
    public static final Set<IndexUpdateInfo> mCurIndexUpdInfo = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class IndexUpdateInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String SYNC_KEY_BASE_VERSION = "baseVersion";
        public static final String SYNC_KEY_CDN = "cdn";
        public static final String SYNC_KEY_MD5 = "md5";
        public static final String SYNC_KEY_PROTOCOL = "protocol";
        public static final String SYNC_KEY_RESOURCEID = "resourceId";
        public String baseVersion;
        public String cdn;
        public String md5;
        public String protocol;
        public String resourceId;

        static {
            t2o.a(613417103);
        }

        public boolean checkValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
            }
            if (!TextUtils.isEmpty(this.cdn) && !TextUtils.isEmpty(this.resourceId) && !TextUtils.isEmpty(this.md5)) {
                return true;
            }
            OLog.w(IndexUpdateHandler.TAG, "lack param", new Object[0]);
            return false;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IndexUpdateInfo indexUpdateInfo = (IndexUpdateInfo) obj;
            if (this.cdn.equals(indexUpdateInfo.cdn) && this.resourceId.equals(indexUpdateInfo.resourceId)) {
                return this.md5.equals(indexUpdateInfo.md5);
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return (((this.cdn.hashCode() * 31) + this.resourceId.hashCode()) * 31) + this.md5.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "IndexUpdateInfo{cdn='" + this.cdn + "', resourceId='" + this.resourceId + "', md5='" + this.md5 + "', protocol='" + this.protocol + "', baseVersion='" + this.baseVersion + "'}";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11402a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.orange.sync.IndexUpdateHandler$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class C0641a extends gr1<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0641a(String str, boolean z, String str2) {
                super(str, z, str2);
            }

            public static /* synthetic */ Object ipc$super(C0641a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/sync/IndexUpdateHandler$1$1");
            }

            @Override // tb.gr1
            public Map<String, String> i() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Map) ipChange.ipc$dispatch("617e580a", new Object[]{this});
                }
                HashMap hashMap = new HashMap();
                hashMap.put(OConstant.KEY_CLIENTAPPINDEXVERSION, a.this.f11402a);
                hashMap.put(OConstant.KEY_CLIENTVERSIONINDEXVERSION, a.this.b);
                return hashMap;
            }

            @Override // tb.gr1
            public String j() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("3a80c94f", new Object[]{this});
                }
                return null;
            }

            /* renamed from: o */
            public String l(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("88312de3", new Object[]{this, str});
                }
                return str;
            }
        }

        public a(String str, String str2) {
            this.f11402a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (com.taobao.orange.a.v == 0) {
                str = OConstant.REQTYPE_INDEX_UPDATE;
            } else {
                str = OConstant.REQTYPE_PROBE_UPDATE;
            }
            IndexUpdateHandler.c(new C0641a(null, false, str).m(), true);
        }
    }

    static {
        t2o.a(613417100);
    }

    public static IndexUpdateInfo b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndexUpdateInfo) ipChange.ipc$dispatch("8c2fd782", new Object[]{str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            return (IndexUpdateInfo) JSON.parseObject(str, IndexUpdateInfo.class);
        }
        String[] split = str.split("&");
        if (split == null) {
            return null;
        }
        IndexUpdateInfo indexUpdateInfo = new IndexUpdateInfo();
        for (String str2 : split) {
            if (str2 != null) {
                String substring = str2.substring(str2.indexOf("=") + 1);
                if (str2.startsWith("cdn")) {
                    indexUpdateInfo.cdn = substring.trim();
                } else if (str2.startsWith("md5")) {
                    indexUpdateInfo.md5 = substring.trim();
                } else if (str2.startsWith(IndexUpdateInfo.SYNC_KEY_RESOURCEID)) {
                    indexUpdateInfo.resourceId = substring.trim();
                } else if (str2.startsWith("protocol")) {
                    indexUpdateInfo.protocol = substring;
                } else if (str2.startsWith("baseVersion")) {
                    indexUpdateInfo.baseVersion = substring.trim();
                }
            }
        }
        return indexUpdateInfo;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29d292e", new Object[]{str, str2});
        } else if (!cw0.h(com.taobao.orange.a.g) || !b) {
            synchronized (IndexUpdateHandler.class) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - f11401a <= 20000) {
                        OLog.w(TAG, "checkIndexUpdate too frequently, interval should more than 20s", new Object[0]);
                        return;
                    }
                    f11401a = currentTimeMillis;
                    OLog.i(TAG, "checkIndexUpdate", OConstant.DIMEN_INDEX_UPDATE_APP_INDEX_VERSION, str, "versionIndexVersion", str2);
                    fck.c(new a(str, str2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            OLog.w(TAG, "checkIndexUpdate skip as in com.taobao.taobao package", new Object[0]);
        }
    }

    public static void c(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9618aba", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            IndexUpdateInfo b2 = b(str, z);
            if (b2 != null && b2.checkValid()) {
                Set<IndexUpdateInfo> set = mCurIndexUpdInfo;
                synchronized (set) {
                    if (!set.add(b2)) {
                        if (OLog.isPrintLog(0)) {
                            OLog.v(TAG, "updateIndex is ongoing", new Object[0]);
                        }
                        return;
                    }
                    if (OLog.isPrintLog(2)) {
                        OLog.i(TAG, "updateIndex", b2);
                    }
                    if ("https".equalsIgnoreCase(b2.protocol)) {
                        str2 = "https";
                    } else {
                        str2 = "http";
                    }
                    com.taobao.orange.a.p = str2;
                    ConfigCenter.getInstance().updateIndex(b2);
                    synchronized (set) {
                        set.remove(b2);
                    }
                }
            }
        } catch (Throwable th) {
            OLog.e(TAG, "updateIndex", th, new Object[0]);
        }
    }
}
