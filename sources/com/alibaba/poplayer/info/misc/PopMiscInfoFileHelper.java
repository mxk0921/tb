package com.alibaba.poplayer.info.misc;

import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.exception.PoplayerException;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;
import tb.wdm;
import tb.ycm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PopMiscInfoFileHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile JSONObject f2524a;
    public final ycm b = new ycm("poplayer_misc_page");
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ConfigPersistentInfo implements Serializable {
        public boolean enable = true;
        public int lastP = 1000;

        static {
            t2o.a(625999936);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final PopMiscInfoFileHelper f2525a = new PopMiscInfoFileHelper();

        static {
            t2o.a(625999937);
        }

        public static /* synthetic */ PopMiscInfoFileHelper a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PopMiscInfoFileHelper) ipChange.ipc$dispatch("388c1f09", new Object[0]);
            }
            return f2525a;
        }
    }

    static {
        t2o.a(625999935);
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("267b573e", new Object[0]);
        }
        return "config_persistent_info";
    }

    public static PopMiscInfoFileHelper g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopMiscInfoFileHelper) ipChange.ipc$dispatch("203f0d04", new Object[0]);
        }
        return a.a();
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849419ab", new Object[]{this});
            return;
        }
        if (this.f2524a != null) {
            this.f2524a.remove(e());
        }
        this.b.g(this.f2524a.toJSONString());
    }

    public synchronized void b(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba0f131", new Object[]{this, set});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new PoplayerException("Please don't execute on UI Thread.");
        } else if (set != null) {
            JSONObject f = f();
            if (f != null) {
                String e = e();
                JSONObject jSONObject = f.getJSONObject(e);
                if (jSONObject != null) {
                    Iterator<Map.Entry<String, Object>> it = jSONObject.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Object> next = it.next();
                        if (next != null && !set.contains(next.getKey())) {
                            it.remove();
                        }
                    }
                    f.put(e, (Object) jSONObject);
                    this.b.g(f.toJSONString());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3 A[Catch: all -> 0x0047, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:13:0x0025, B:17:0x002d, B:19:0x003e, B:20:0x004a, B:22:0x0052, B:24:0x0066, B:26:0x006a, B:27:0x006d, B:29:0x0071, B:30:0x007c, B:32:0x0080, B:35:0x008e, B:37:0x0094, B:40:0x00a3, B:42:0x00ae), top: B:49:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean c(com.alibaba.poplayer.trigger.BaseConfigItem r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            monitor-enter(r7)
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.$ipChange     // Catch: all -> 0x001e
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x001e
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = "bb32d1fa"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: all -> 0x001e
            r4[r1] = r7     // Catch: all -> 0x001e
            r4[r0] = r8     // Catch: all -> 0x001e
            java.lang.Object r8 = r2.ipc$dispatch(r3, r4)     // Catch: all -> 0x001e
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: all -> 0x001e
            boolean r8 = r8.booleanValue()     // Catch: all -> 0x001e
            monitor-exit(r7)
            return r8
        L_0x001e:
            r8 = move-exception
            goto L_0x00bd
        L_0x0021:
            if (r8 != 0) goto L_0x0025
            monitor-exit(r7)
            return r1
        L_0x0025:
            com.alibaba.fastjson.JSONObject r2 = r7.f()     // Catch: all -> 0x0047
            if (r2 != 0) goto L_0x002d
            monitor-exit(r7)
            return r0
        L_0x002d:
            java.lang.String r3 = "PopMiscInfoFileHelper.getConfigPercentEnableFor."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: all -> 0x0047
            tb.wdm.d(r3, r4)     // Catch: all -> 0x0047
            java.lang.String r3 = e()     // Catch: all -> 0x0047
            com.alibaba.fastjson.JSONObject r4 = r2.getJSONObject(r3)     // Catch: all -> 0x0047
            if (r4 != 0) goto L_0x004a
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject     // Catch: all -> 0x0047
            r4.<init>()     // Catch: all -> 0x0047
            r2.put(r3, r4)     // Catch: all -> 0x0047
            goto L_0x004a
        L_0x0047:
            r8 = move-exception
            goto L_0x00b6
        L_0x004a:
            java.lang.String r3 = r8.indexID     // Catch: all -> 0x0047
            java.lang.Object r5 = r4.get(r3)     // Catch: all -> 0x0047
            if (r5 != 0) goto L_0x0066
            com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo r5 = new com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo     // Catch: all -> 0x0047
            r5.<init>()     // Catch: all -> 0x0047
            int r8 = r8.enablePercent     // Catch: all -> 0x0047
            r5.lastP = r8     // Catch: all -> 0x0047
            boolean r8 = r7.d(r8)     // Catch: all -> 0x0047
            r5.enable = r8     // Catch: all -> 0x0047
            r4.put(r3, r5)     // Catch: all -> 0x0047
        L_0x0064:
            r8 = 1
            goto L_0x00a1
        L_0x0066:
            boolean r6 = r5 instanceof com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo     // Catch: all -> 0x0047
            if (r6 == 0) goto L_0x006d
            com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo r5 = (com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo) r5     // Catch: all -> 0x0047
            goto L_0x008c
        L_0x006d:
            boolean r6 = r5 instanceof com.alibaba.fastjson.JSONObject     // Catch: all -> 0x0047
            if (r6 == 0) goto L_0x007c
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5     // Catch: all -> 0x0047
            java.lang.Class<com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo> r6 = com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo.class
            java.lang.Object r5 = r5.toJavaObject(r6)     // Catch: all -> 0x0047
            com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo r5 = (com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo) r5     // Catch: all -> 0x0047
            goto L_0x008c
        L_0x007c:
            boolean r6 = r5 instanceof java.lang.String     // Catch: all -> 0x0047
            if (r6 == 0) goto L_0x008b
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x0047
            java.lang.Class<com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo> r6 = com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo.class
            java.lang.Object r5 = com.alibaba.fastjson.JSON.parseObject(r5, r6)     // Catch: all -> 0x0047
            com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo r5 = (com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo) r5     // Catch: all -> 0x0047
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            if (r5 == 0) goto L_0x00a0
            int r6 = r5.lastP     // Catch: all -> 0x0047
            int r8 = r8.enablePercent     // Catch: all -> 0x0047
            if (r6 == r8) goto L_0x00a0
            r5.lastP = r8     // Catch: all -> 0x0047
            boolean r8 = r7.d(r8)     // Catch: all -> 0x0047
            r5.enable = r8     // Catch: all -> 0x0047
            r4.put(r3, r5)     // Catch: all -> 0x0047
            goto L_0x0064
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r8 == 0) goto L_0x00ac
            tb.ycm r8 = r7.b     // Catch: all -> 0x0047
            java.lang.String r2 = r2.toJSONString()     // Catch: all -> 0x0047
            r8.g(r2)     // Catch: all -> 0x0047
        L_0x00ac:
            if (r5 == 0) goto L_0x00b4
            boolean r8 = r5.enable     // Catch: all -> 0x0047
            if (r8 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            monitor-exit(r7)
            return r0
        L_0x00b6:
            java.lang.String r1 = "PopMiscInfoFileHelper getConfigPercentEnableFor error."
            tb.wdm.h(r1, r8)     // Catch: all -> 0x001e
            monitor-exit(r7)
            return r0
        L_0x00bd:
            monitor-exit(r7)     // Catch: all -> 0x001e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.c(com.alibaba.poplayer.trigger.BaseConfigItem):boolean");
    }

    public final boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("192db59e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Random random = new Random(System.nanoTime());
        if (i < 0) {
            i = 0;
        }
        if (i > 1000) {
            i = 1000;
        }
        if (i == 0 || Math.abs(random.nextLong()) % 1000 > i - 1) {
            return false;
        }
        return true;
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f8679f64", new Object[]{this});
        }
        if (this.f2524a == null) {
            this.f2524a = new JSONObject(new ConcurrentHashMap());
        }
        return this.f2524a;
    }

    public synchronized void h(List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23beb94a", new Object[]{this, list});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            JSONObject f = f();
            if (f != null) {
                String e = e();
                JSONObject jSONObject = f.getJSONObject(e);
                JSONObject jSONObject2 = new JSONObject();
                for (BaseConfigItem baseConfigItem : list) {
                    ConfigPersistentInfo configPersistentInfo = new ConfigPersistentInfo();
                    if (jSONObject != null) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject(baseConfigItem.indexID);
                        if (jSONObject3 == null || !jSONObject3.containsKey("lastP") || !jSONObject3.containsKey("enable") || jSONObject3.getInteger("lastP").intValue() != baseConfigItem.enablePercent) {
                            int i = baseConfigItem.enablePercent;
                            configPersistentInfo.lastP = i;
                            configPersistentInfo.enable = d(i);
                        } else {
                            ConfigPersistentInfo configPersistentInfo2 = (ConfigPersistentInfo) jSONObject3.toJavaObject(ConfigPersistentInfo.class);
                            configPersistentInfo.lastP = configPersistentInfo2.lastP;
                            configPersistentInfo.enable = configPersistentInfo2.enable;
                        }
                    } else {
                        int i2 = baseConfigItem.enablePercent;
                        configPersistentInfo.lastP = i2;
                        configPersistentInfo.enable = d(i2);
                    }
                    jSONObject2.put(baseConfigItem.indexID, (Object) configPersistentInfo);
                }
                f.put(e, (Object) jSONObject2);
                this.b.g(f.toJSONString());
            }
        } else {
            throw new PoplayerException("Please don't execute on UI Thread.");
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60dfd23", new Object[]{this});
            return;
        }
        wdm.d("PopMiscInfoFileHelper.readAndSetup.", new Object[0]);
        if (!this.c.getAndSet(true)) {
            wdm.d("PopMiscInfoFileHelper.readAndSetup.start", new Object[0]);
            this.f2524a = this.b.f();
            String e = e();
            if (this.f2524a != null && !this.f2524a.containsKey(e)) {
                this.f2524a.put(e, (Object) new JSONObject());
            }
            wdm.d("PopMiscInfoFileHelper.readAndSetup.end", new Object[0]);
        }
    }
}
