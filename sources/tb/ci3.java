package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.impl.collect.ChangeRecord;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ci3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f17075a;
    public final Context b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ci3(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getFilesDir()
            java.lang.String r2 = "tinct"
            r0.<init>(r1, r2)
            int r1 = com.taobao.tinct.impl.config.a.f()
            r2 = 1
            if (r1 == r2) goto L_0x0024
            r2 = 2
            if (r1 == r2) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "test"
            r1.<init>(r0, r2)
        L_0x0022:
            r0 = r1
            goto L_0x002d
        L_0x0024:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "pre"
            r1.<init>(r0, r2)
            goto L_0x0022
        L_0x002d:
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0036
            r0.mkdirs()
        L_0x0036:
            r3.b = r4
            java.io.File r4 = new java.io.File
            java.lang.String r1 = com.taobao.tinct.impl.config.a.j()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "-tinct.history"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.<init>(r0, r1)
            r3.f17075a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ci3.<init>(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.tinct.impl.collect.ChangeRecord a() {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ci3.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "a4d97952"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r12
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            com.taobao.tinct.impl.collect.ChangeRecord r0 = (com.taobao.tinct.impl.collect.ChangeRecord) r0
            return r0
        L_0x0015:
            java.io.File r2 = r12.f17075a
            boolean r2 = r2.exists()
            r3 = 0
            if (r2 == 0) goto L_0x007c
            java.lang.String r2 = r12.d()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x007c
            java.lang.Class<com.taobao.tinct.impl.collect.ChangeRecord> r4 = com.taobao.tinct.impl.collect.ChangeRecord.class
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject(r2, r4)     // Catch: Exception -> 0x0078
            com.taobao.tinct.impl.collect.ChangeRecord r2 = (com.taobao.tinct.impl.collect.ChangeRecord) r2     // Catch: Exception -> 0x0078
            long r3 = java.lang.System.currentTimeMillis()     // Catch: Exception -> 0x005b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.taobao.tinct.model.OrangeChangeInfo> r5 = r2.orangeChangeMap     // Catch: Exception -> 0x005b
            java.util.Collection r5 = r5.values()     // Catch: Exception -> 0x005b
            java.util.Iterator r5 = r5.iterator()     // Catch: Exception -> 0x005b
        L_0x003e:
            boolean r6 = r5.hasNext()     // Catch: Exception -> 0x005b
            if (r6 == 0) goto L_0x0076
            java.lang.Object r6 = r5.next()     // Catch: Exception -> 0x005b
            com.taobao.tinct.model.OrangeChangeInfo r6 = (com.taobao.tinct.model.OrangeChangeInfo) r6     // Catch: Exception -> 0x005b
            int r7 = r6.getStatus()     // Catch: Exception -> 0x005b
            if (r7 != r1) goto L_0x005e
            boolean r7 = r6.isExpire()     // Catch: Exception -> 0x005b
            if (r7 == 0) goto L_0x005e
            r7 = 2
            r6.setStatus(r7)     // Catch: Exception -> 0x005b
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            r3 = r2
            goto L_0x0079
        L_0x005e:
            boolean r7 = r6.isGray()     // Catch: Exception -> 0x005b
            if (r7 == 0) goto L_0x003e
            long r7 = r6.getUpdateTime()     // Catch: Exception -> 0x005b
            long r7 = r3 - r7
            long r9 = com.taobao.tinct.impl.config.a.i()     // Catch: Exception -> 0x005b
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x003e
            r6.setGray(r0)     // Catch: Exception -> 0x005b
            goto L_0x003e
        L_0x0076:
            r3 = r2
            goto L_0x007c
        L_0x0078:
            r0 = move-exception
        L_0x0079:
            r0.printStackTrace()
        L_0x007c:
            if (r3 != 0) goto L_0x0083
            com.taobao.tinct.impl.collect.ChangeRecord r3 = new com.taobao.tinct.impl.collect.ChangeRecord
            r3.<init>()
        L_0x0083:
            com.taobao.tinct.model.InstantPatchChangeInfo r0 = r12.c()
            r3.instantPatchInfo = r0
            tb.h9f r0 = r12.b()
            r3.inlinePatchInfo = r0
            boolean r0 = com.taobao.tinct.impl.config.a.y()
            java.lang.String r1 = "ChangeDataManager"
            if (r0 == 0) goto L_0x00b5
            android.content.Context r0 = r12.b
            java.util.List r0 = tb.n48.a(r0)
            r3.dynamicChangeInfos = r0
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "dynamic change: "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r1, r0)
            goto L_0x00ba
        L_0x00b5:
            java.lang.String r0 = "dynamic change is disable"
            android.util.Log.e(r1, r0)
        L_0x00ba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ci3.a():com.taobao.tinct.impl.collect.ChangeRecord");
    }

    public h9f b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9f) ipChange.ipc$dispatch("38d235f8", new Object[]{this});
        }
        String patchVersion = h9f.getPatchVersion(this.b);
        String patchType = h9f.getPatchType(this.b);
        if (!TextUtils.isEmpty(patchVersion)) {
            return new h9f(patchVersion, patchType);
        }
        return null;
    }

    public InstantPatchChangeInfo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstantPatchChangeInfo) ipChange.ipc$dispatch("89330fb0", new Object[]{this});
        }
        String patchVersion = InstantPatchChangeInfo.getPatchVersion(this.b);
        String patchType = InstantPatchChangeInfo.getPatchType(this.b);
        if (!TextUtils.isEmpty(patchVersion)) {
            return new InstantPatchChangeInfo(patchVersion, patchType);
        }
        return null;
    }

    public final String d() {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9114e7f", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            fileInputStream = new FileInputStream(this.f17075a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            fileInputStream.close();
            return sb.toString();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public void e(ChangeRecord changeRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1ccca4", new Object[]{this, changeRecord});
        } else if (changeRecord != null) {
            f(JSON.toJSONString(changeRecord));
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72baa2", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f17075a);
                try {
                    FileChannel channel = fileOutputStream.getChannel();
                    channel.write(Charset.forName("utf8").encode(str));
                    channel.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
