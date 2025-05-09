package tb;

import android.text.TextUtils;
import anetwork.network.cache.RpcCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import java.security.MessageDigest;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fp implements nr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("538e5a8d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "mtop_apicache_";
        }
        return "mtop_apicache_" + str;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ce04fe", new Object[]{this})).booleanValue();
        }
        return RemoteConfig.getInstance().degradeToSQLite;
    }

    public boolean e(String str, String str2, RpcCache rpcCache) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47a77b6e", new Object[]{this, str, str2, rpcCache})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = null;
        try {
            np cacheForModule = AVFSCacheManager.getInstance().cacheForModule(c(str2));
            if (cacheForModule != null) {
                str3 = b(str);
                if (d()) {
                    z = cacheForModule.C().N(str3, rpcCache);
                } else {
                    z = cacheForModule.w().N(str3, rpcCache);
                }
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "[put] put RpcCache failed!ModuleName=" + str2 + " cacheKey=" + str, th);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[put]put RpcCache result=");
            sb.append(z);
            sb.append(" ,time cost(ms):");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(",cacheKey=");
            sb.append(str);
            sb.append(",md5key=");
            sb.append(str3);
            sb.append(",cacheBlockName=");
            sb.append(str2);
            TBSdkLog.d("mtopsdk.AVFSApiCache", sb.toString());
        }
        return z;
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{this, str})).booleanValue();
        }
        try {
            np cacheForModule = AVFSCacheManager.getInstance().cacheForModule(c(str));
            if (cacheForModule != null) {
                if (d()) {
                    return cacheForModule.C().s();
                }
                return cacheForModule.w().s();
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "remove all cache for module failed! ModuleName=" + str, th);
        }
        return false;
    }

    public boolean g(String str, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("731066a3", new Object[]{this, str, str2})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = null;
        try {
            np cacheForModule = AVFSCacheManager.getInstance().cacheForModule(c(str));
            if (cacheForModule != null) {
                str3 = b(str2);
                if (d()) {
                    z = cacheForModule.C().A0(str3);
                } else {
                    z = cacheForModule.w().A0(str3);
                }
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "remove cache failed! ModuleName=" + str + " cacheKey=" + str2, th);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[remove]remove cache result=");
            sb.append(z);
            sb.append(" ,time cost(ms):");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(",cacheKey=");
            sb.append(str2);
            sb.append(",md5key=");
            sb.append(str3);
            sb.append(",cacheBlockName=");
            sb.append(str);
            TBSdkLog.d("mtopsdk.AVFSApiCache", sb.toString());
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anetwork.network.cache.RpcCache a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "mtopsdk.AVFSApiCache"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.fp.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001e
            java.lang.String r2 = "218d40f5"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r11 = 2
            r4[r11] = r12
            java.lang.Object r11 = r3.ipc$dispatch(r2, r4)
            anetwork.network.cache.RpcCache r11 = (anetwork.network.cache.RpcCache) r11
            return r11
        L_0x001e:
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 0
            com.taobao.alivfssdk.cache.AVFSCacheManager r6 = com.taobao.alivfssdk.cache.AVFSCacheManager.getInstance()     // Catch: all -> 0x0054
            java.lang.String r7 = r10.c(r12)     // Catch: all -> 0x0054
            tb.np r6 = r6.cacheForModule(r7)     // Catch: all -> 0x0054
            if (r6 == 0) goto L_0x0057
            java.lang.String r7 = r10.b(r11)     // Catch: all -> 0x0054
            boolean r8 = r10.d()     // Catch: all -> 0x0047
            if (r8 == 0) goto L_0x0049
            tb.fdb r6 = r6.C()     // Catch: all -> 0x0047
            java.lang.Object r6 = r6.d0(r7)     // Catch: all -> 0x0047
            anetwork.network.cache.RpcCache r6 = (anetwork.network.cache.RpcCache) r6     // Catch: all -> 0x0047
        L_0x0045:
            r5 = r6
            goto L_0x0072
        L_0x0047:
            r6 = move-exception
            goto L_0x0059
        L_0x0049:
            tb.fdb r6 = r6.w()     // Catch: all -> 0x0047
            java.lang.Object r6 = r6.d0(r7)     // Catch: all -> 0x0047
            anetwork.network.cache.RpcCache r6 = (anetwork.network.cache.RpcCache) r6     // Catch: all -> 0x0047
            goto L_0x0045
        L_0x0054:
            r6 = move-exception
            r7 = r5
            goto L_0x0059
        L_0x0057:
            r7 = r5
            goto L_0x0072
        L_0x0059:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "[get] get cache failed!ModuleName="
            r8.<init>(r9)
            r8.append(r12)
            java.lang.String r9 = " cacheKey="
            r8.append(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            mtopsdk.common.util.TBSdkLog.e(r2, r8, r6)
        L_0x0072:
            mtopsdk.common.util.TBSdkLog$LogEnable r6 = mtopsdk.common.util.TBSdkLog.LogEnable.DebugEnable
            boolean r6 = mtopsdk.common.util.TBSdkLog.isLogEnable(r6)
            if (r6 == 0) goto L_0x00b9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 64
            r6.<init>(r8)
            java.lang.String r8 = "[get] get RpcCache result="
            r6.append(r8)
            if (r5 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            r6.append(r0)
            java.lang.String r0 = " ,time cost(ms):"
            r6.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            r6.append(r0)
            java.lang.String r0 = ",cacheKey="
            r6.append(r0)
            r6.append(r11)
            java.lang.String r11 = ",md5key="
            r6.append(r11)
            r6.append(r7)
            java.lang.String r11 = ",cacheBlockName="
            r6.append(r11)
            r6.append(r12)
            java.lang.String r11 = r6.toString()
            mtopsdk.common.util.TBSdkLog.d(r2, r11)
        L_0x00b9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fp.a(java.lang.String, java.lang.String):anetwork.network.cache.RpcCache");
    }

    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64ccadf7", new Object[]{this, str})).booleanValue();
        }
        try {
            AVFSCacheManager.getInstance().removeCacheForModule(c(str));
            return true;
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "uninstall cache failed! ModuleName=" + str, th);
            return false;
        }
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3869b6e7", new Object[]{this, str});
        }
        if (StringUtils.isBlank(str)) {
            return str;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes("utf-8"));
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "[getMd5] compute md5 value failed for source str=" + str, e);
            return null;
        }
    }
}
