package android.taobao.windvane.extra.uc;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import tb.iqw;
import tb.jqw;
import tb.kqw;
import tb.lqw;
import tb.t2o;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCPrecacheManager implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCPrecacheManager";
    private static final long sMaxPrecacheTime = 3600000;
    private Handler mPrecacheHandler;
    private static WVUCPrecacheManager mInstance = null;
    private static boolean sHasInitUrlSet = false;
    private static boolean sHasPrecache = false;
    private static boolean sCanClearByCommonConfig = false;
    private static boolean sCanClearByZcacheUpdate = false;
    private static boolean sCanPrecacheByCommonConfig = false;
    private static boolean sCanPrecacheByZcacheUpdate = false;
    private static boolean sLastEnableUCPrecache = false;
    private static String sLastPrecachePackageName = "";
    private static long sLastPrecacheTime = -1;
    private static HashSet<String> sPreMemCacheUrlSet = new HashSet<>();
    private static HashSet<String> sPrecacheDocResMap = new HashSet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class WVUCPrecacheManagerHolder {
        public static final WVUCPrecacheManager sInstance = new WVUCPrecacheManager();

        static {
            t2o.a(989856106);
        }

        private WVUCPrecacheManagerHolder() {
        }
    }

    static {
        t2o.a(989856104);
        t2o.a(989856388);
    }

    public static boolean canClearPrecache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("720990c7", new Object[0])).booleanValue();
        }
        if (!sHasPrecache) {
            return false;
        }
        if (sCanClearByCommonConfig || sCanClearByZcacheUpdate) {
            return true;
        }
        if (sLastPrecacheTime <= 0 || System.currentTimeMillis() - sLastPrecacheTime <= 3600000) {
            return false;
        }
        return true;
    }

    public static boolean canPrecache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c673d3ba", new Object[0])).booleanValue();
        }
        if (vpw.commonConfig.o && !TextUtils.isEmpty(sLastPrecachePackageName)) {
            if (!sHasInitUrlSet) {
                sHasInitUrlSet = true;
                updatePreMemCacheUrls();
            }
            HashSet<String> hashSet = sPreMemCacheUrlSet;
            if (hashSet != null && hashSet.size() > 0) {
                if (sCanPrecacheByCommonConfig || sCanPrecacheByZcacheUpdate || !sHasPrecache) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static WVUCPrecacheManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCPrecacheManager) ipChange.ipc$dispatch("432cac70", new Object[0]);
        }
        return WVUCPrecacheManagerHolder.sInstance;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            lqw.d().b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void notifyUpdateCommonConfig() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.extra.uc.WVUCPrecacheManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = "8acf4a6"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.ipc$dispatch(r1, r2)
            return
        L_0x000f:
            tb.wpw r0 = tb.vpw.commonConfig
            boolean r1 = r0.o
            java.lang.String r0 = r0.p
            boolean r3 = android.taobao.windvane.extra.uc.WVUCPrecacheManager.sLastEnableUCPrecache
            r4 = 1
            if (r3 == 0) goto L_0x0022
            if (r1 != 0) goto L_0x0022
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanClearByCommonConfig = r4
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanPrecacheByCommonConfig = r2
        L_0x0020:
            r2 = 1
            goto L_0x002b
        L_0x0022:
            if (r3 != 0) goto L_0x002b
            if (r1 == 0) goto L_0x002b
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanClearByCommonConfig = r4
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanPrecacheByCommonConfig = r4
            goto L_0x0020
        L_0x002b:
            java.lang.String r3 = android.taobao.windvane.extra.uc.WVUCPrecacheManager.sLastPrecachePackageName
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x003e
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanClearByCommonConfig = r4
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x003f
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanPrecacheByCommonConfig = r4
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sLastEnableUCPrecache = r1
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sLastPrecachePackageName = r0
            if (r4 != 0) goto L_0x0049
            boolean r0 = android.taobao.windvane.extra.uc.WVUCPrecacheManager.sHasInitUrlSet
            if (r0 != 0) goto L_0x004c
        L_0x0049:
            updatePreMemCacheUrls()
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCPrecacheManager.notifyUpdateCommonConfig():void");
    }

    public static HashSet<String> preMemCacheUrlSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("978d02a7", new Object[0]);
        }
        return sPreMemCacheUrlSet;
    }

    public static void resetClearConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6915dfa7", new Object[0]);
            return;
        }
        sCanClearByCommonConfig = false;
        sCanClearByZcacheUpdate = false;
    }

    public static void resetPrecacheConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a93e97", new Object[0]);
            return;
        }
        sCanPrecacheByCommonConfig = false;
        sCanPrecacheByZcacheUpdate = false;
    }

    private void sendClearPrecacheDocMessage(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbc7aa4", new Object[]{this, str});
        } else if (sPrecacheDocResMap.size() > 0) {
            if (this.mPrecacheHandler == null) {
                this.mPrecacheHandler = new Handler();
            }
            this.mPrecacheHandler.postDelayed(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCPrecacheManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVUCPrecacheManager.this.clearPrecacheDoc(str);
                    }
                }
            }, 10000L);
        }
    }

    public static void setHasPrecache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250a97d6", new Object[]{new Boolean(z)});
            return;
        }
        sHasPrecache = z;
        if (z) {
            sLastPrecacheTime = System.currentTimeMillis();
        } else {
            sLastPrecacheTime = -1L;
        }
    }

    private static void updatePreMemCacheUrls() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f06a72", new Object[0]);
        } else if (!vpw.commonConfig.o || TextUtils.isEmpty(sLastPrecachePackageName)) {
            sPreMemCacheUrlSet = new HashSet<>();
        } else {
            kqw g = lqw.d().g(6011, sLastPrecachePackageName);
            if (g.f22859a && (obj = g.b) != null && (obj instanceof HashSet)) {
                sPreMemCacheUrlSet = (HashSet) obj;
                sHasInitUrlSet = true;
            }
        }
    }

    public void addPrecacheDoc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49df5f29", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.indexOf("#") > 0) {
                str = str.substring(0, str.indexOf("#"));
            }
            sPrecacheDocResMap.add(str);
            sendClearPrecacheDocMessage(str);
        }
    }

    public boolean canPrecacheDoc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("611139de", new Object[]{this, str})).booleanValue();
        }
        if (!vpw.commonConfig.q || TextUtils.isEmpty(str)) {
            return false;
        }
        if (sPreMemCacheUrlSet.isEmpty()) {
            return true;
        }
        Iterator<String> it = sPreMemCacheUrlSet.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void clearPrecacheDoc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bce86fd", new Object[]{this, str});
            return;
        }
        if (str.indexOf("#") > 0) {
            str = str.substring(0, str.indexOf("#"));
        }
        sPrecacheDocResMap.remove(str);
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        if (i == 6008) {
            notifyUpdateZcache((String) objArr[0]);
            return null;
        } else if (i != 6012) {
            return null;
        } else {
            notifyUpdateCommonConfig();
            return null;
        }
    }

    private WVUCPrecacheManager() {
        this.mPrecacheHandler = null;
        init();
    }

    private static void notifyUpdateZcache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d9b66b", new Object[]{str});
        } else if (!TextUtils.isEmpty(str) && str.equals(sLastPrecachePackageName)) {
            sCanClearByZcacheUpdate = true;
            sCanPrecacheByZcacheUpdate = true;
            updatePreMemCacheUrls();
        }
    }

    public boolean hasPrecacheDoc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec2854", new Object[]{this, str})).booleanValue();
        }
        if (str.indexOf("#") > 0) {
            str = str.substring(0, str.indexOf("#"));
        }
        return sPrecacheDocResMap.contains(str);
    }
}
