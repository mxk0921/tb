package com.taobao.global.setting.megability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility;
import com.taobao.android.abilityidl.ability.GeneralSettingOnChangeData;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import tb.f6a;
import tb.kdb;
import tb.l81;
import tb.n81;
import tb.o81;
import tb.tao;
import tb.w8c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GeneralSettingAbility extends AbsGeneralSettingAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final n81 f10586a = new n81(Globals.getApplication());
    public final Map<String, l81> b = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements l81 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w8c f10587a;

        public a(GeneralSettingAbility generalSettingAbility, w8c w8cVar) {
            this.f10587a = w8cVar;
        }

        @Override // tb.l81
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb67a1", new Object[]{this, obj});
            } else if (obj != null) {
                GeneralSettingOnChangeData generalSettingOnChangeData = new GeneralSettingOnChangeData();
                generalSettingOnChangeData.value = obj.toString();
                this.f10587a.q(generalSettingOnChangeData);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(GeneralSettingAbility generalSettingAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/global/setting/megability/GeneralSettingAbility");
    }

    public final synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bde671", new Object[]{this, str});
            return;
        }
        if (((HashMap) this.b).containsKey(str)) {
            o81.e(str, (l81) ((HashMap) this.b).get(str));
            ((HashMap) this.b).remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    @Override // com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.tao<java.lang.String, com.alibaba.ability.result.ErrorResult> get(tb.kdb r5, tb.f6a r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.global.setting.megability.GeneralSettingAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "620cb7cd"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            tb.tao r5 = (tb.tao) r5
            return r5
        L_0x001b:
            java.lang.String r0 = "url"
            java.lang.Object r0 = r5.m(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L_0x0049
            java.net.URL r1 = new java.net.URL     // Catch: Exception -> 0x0048
            r1.<init>(r0)     // Catch: Exception -> 0x0048
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: Exception -> 0x0048
            r0.<init>()     // Catch: Exception -> 0x0048
            java.lang.String r3 = r1.getHost()     // Catch: Exception -> 0x0048
            r0.append(r3)     // Catch: Exception -> 0x0048
            java.lang.String r1 = r1.getPath()     // Catch: Exception -> 0x0048
            r0.append(r1)     // Catch: Exception -> 0x0048
            java.lang.String r0 = r0.toString()     // Catch: Exception -> 0x0048
            goto L_0x004a
        L_0x0048:
        L_0x0049:
            r0 = r2
        L_0x004a:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x005e
            tb.ldb r1 = r5.a()
            if (r1 == 0) goto L_0x005e
            tb.ldb r5 = r5.a()
            java.lang.String r0 = r5.getBusinessID()
        L_0x005e:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "mtbSettings"
            if (r5 == 0) goto L_0x007c
            java.lang.String r5 = "GeneralSettingAbility user data url is null and env.getBusinessID is null"
            com.taobao.tao.log.TLog.loge(r1, r5)
            tb.tao r5 = new tb.tao
            com.alibaba.ability.result.ErrorResult r6 = new com.alibaba.ability.result.ErrorResult
            java.lang.String r0 = "500"
            java.lang.String r1 = "user data url is null and env.getBusinessID is null"
            r6.<init>(r0, r1)
            r5.<init>(r2, r6)
            return r5
        L_0x007c:
            java.lang.String r5 = r6.f19047a
            java.lang.String r3 = "tbGlobalMuteSetting"
            boolean r5 = android.text.TextUtils.equals(r5, r3)
            if (r5 == 0) goto L_0x00b4
            tb.n81 r5 = r4.f10586a
            java.lang.String r0 = r6.f19047a
            boolean r5 = r5.h(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "GeneralSettingAbility key="
            r0.<init>(r2)
            java.lang.String r6 = r6.f19047a
            r0.append(r6)
            java.lang.String r6 = " result="
            r0.append(r6)
            r0.append(r5)
            java.lang.String r6 = r0.toString()
            com.taobao.tao.log.TLog.loge(r1, r6)
            tb.tao r6 = new tb.tao
            r6.<init>(r5)
            return r6
        L_0x00b4:
            tb.n81 r5 = r4.f10586a     // Catch: all -> 0x00bd
            java.lang.String r1 = r6.f19047a     // Catch: all -> 0x00bd
            java.lang.Object r2 = r5.k(r0, r1)     // Catch: all -> 0x00bd
            goto L_0x00c1
        L_0x00bd:
            r5 = move-exception
            r5.printStackTrace()
        L_0x00c1:
            tb.tao r5 = new tb.tao
            if (r2 != 0) goto L_0x00cc
            java.lang.String r6 = r6.f19047a
            java.lang.String r6 = r4.a(r6)
            goto L_0x00d0
        L_0x00cc:
            java.lang.String r6 = r2.toString()
        L_0x00d0:
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.global.setting.megability.GeneralSettingAbility.get(tb.kdb, tb.f6a):tb.tao");
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        synchronized (this) {
            try {
                for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                    o81.e((String) entry.getKey(), (l81) entry.getValue());
                }
                ((HashMap) this.b).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility
    public void setChangeListener(kdb kdbVar, f6a f6aVar, w8c w8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a46f58", new Object[]{this, kdbVar, f6aVar, w8cVar});
            return;
        }
        b(f6aVar.f19047a);
        a aVar = new a(this, w8cVar);
        synchronized (this) {
            ((HashMap) this.b).put(f6aVar.f19047a, aVar);
        }
        o81.d(f6aVar.f19047a, aVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility
    public tao<Object, ErrorResult> unsetChangeListener(kdb kdbVar, f6a f6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("548b56b6", new Object[]{this, kdbVar, f6aVar});
        }
        b(f6aVar.f19047a);
        return new tao<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r6.equals("mute") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.global.setting.megability.GeneralSettingAbility.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "227df149"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1318257740: goto L_0x003b;
                case 3363353: goto L_0x0031;
                case 1417486629: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0045
        L_0x0025:
            java.lang.String r0 = "liveMute"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002f
            goto L_0x0023
        L_0x002f:
            r0 = 2
            goto L_0x0045
        L_0x0031:
            java.lang.String r1 = "mute"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0045
            goto L_0x0023
        L_0x003b:
            java.lang.String r0 = "inTimeFrameMute"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0044
            goto L_0x0023
        L_0x0044:
            r0 = 0
        L_0x0045:
            switch(r0) {
                case 0: goto L_0x004b;
                case 1: goto L_0x004b;
                case 2: goto L_0x004b;
                default: goto L_0x0048;
            }
        L_0x0048:
            java.lang.String r6 = ""
            return r6
        L_0x004b:
            java.lang.String r6 = "false"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.global.setting.megability.GeneralSettingAbility.a(java.lang.String):java.lang.String");
    }
}
