package tb;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b26 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_LNEWCHANNELTAP = -6737700065007810686L;
    public static final String EVENT_TAP_EVENT_UT_COMMIT = "com.taobao.taolive.livehome.commit.ltap";

    /* renamed from: a  reason: collision with root package name */
    public static final String f16135a = b26.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16136a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ Object[] d;
        public final /* synthetic */ DXRuntimeContext e;

        public a(String str, JSONObject jSONObject, JSONObject jSONObject2, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f16136a = str;
            this.b = jSONObject;
            this.c = jSONObject2;
            this.d = objArr;
            this.e = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b26.a(b26.this, this.f16136a, this.b, this.c, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(310378538);
    }

    public static /* synthetic */ void a(b26 b26Var, String str, JSONObject jSONObject, JSONObject jSONObject2, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944c4d1f", new Object[]{b26Var, str, jSONObject, jSONObject2, objArr, dXRuntimeContext});
        } else {
            b26Var.b(str, jSONObject, jSONObject2, objArr, dXRuntimeContext);
        }
    }

    public static ArrayList<cpb> d(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f7c7219c", new Object[]{view});
        }
        ArrayList<cpb> arrayList = new ArrayList<>();
        if (view != null) {
            if (view instanceof tlc) {
                arrayList.add((cpb) view);
            }
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    ArrayList<cpb> d = d(viewGroup.getChildAt(i));
                    if (!d.isEmpty()) {
                        arrayList.addAll(d);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Object ipc$super(b26 b26Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXLNewChannelTapEventHandler");
    }

    public final void c(String str, JSONObject jSONObject, JSONObject jSONObject2, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3638d0", new Object[]{this, str, jSONObject, jSONObject2, objArr, dXRuntimeContext});
        } else {
            Coordinator.execute(new a(str, jSONObject, jSONObject2, objArr, dXRuntimeContext));
        }
    }

    public final String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13f71508", new Object[]{this, str, str2});
        }
        if (!arq.a(str)) {
            return str;
        }
        return str2;
    }

    public final void f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d13001e", new Object[]{this, activity});
            return;
        }
        View findViewById = activity.findViewById(R.id.live_fragment_vp);
        if (Build.VERSION.SDK_INT >= 29 && (findViewById instanceof ViewGroup)) {
            ((ViewGroup) findViewById).suppressLayout(true);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r6, com.alibaba.fastjson.JSONObject r7, com.alibaba.fastjson.JSONObject r8, java.lang.Object[] r9, com.taobao.android.dinamicx.DXRuntimeContext r10) {
        /*
            r5 = this;
            r0 = 2
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.b26.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = "676f6a6a"
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r1 = 1
            r4[r1] = r6
            r4[r0] = r7
            r6 = 3
            r4[r6] = r8
            r6 = 4
            r4[r6] = r9
            r6 = 5
            r4[r6] = r10
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0021:
            if (r7 != 0) goto L_0x002b
            java.lang.String r6 = tb.b26.f16135a
            java.lang.String r7 = "args[0] dataInfo is null."
            tb.r0h.b(r6, r7)
            return
        L_0x002b:
            int r2 = r9.length
            if (r2 <= r0) goto L_0x0037
            r9 = r9[r0]
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x0037
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0038
        L_0x0037:
            r9 = 0
        L_0x0038:
            java.lang.String r0 = "clickName"
            java.lang.String r7 = r7.getString(r0)
            if (r8 == 0) goto L_0x00f2
            java.lang.String r0 = "trackInfo"
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r2 = "clickMaidian"
            com.alibaba.fastjson.JSONObject r8 = r8.getJSONObject(r2)
            if (r8 == 0) goto L_0x00f2
            java.lang.String r2 = "params"
            java.lang.Object r3 = r8.get(r2)
            if (r3 == 0) goto L_0x00f2
            java.lang.String r3 = "name"
            java.lang.String r3 = r8.getString(r3)
            java.lang.String r7 = r5.e(r7, r3)
            boolean r3 = tb.arq.a(r9)
            if (r3 != 0) goto L_0x0082
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = r8.getString(r2)
            r3.append(r8)
            java.lang.String r8 = ","
            r3.append(r8)
            r3.append(r9)
            java.lang.String r8 = r3.toString()
            goto L_0x0086
        L_0x0082:
            java.lang.String r8 = r8.getString(r2)
        L_0x0086:
            boolean r9 = tb.sj7.a()
            if (r9 != 0) goto L_0x00cb
            android.view.View r9 = r10.D()
            java.util.ArrayList r9 = d(r9)
            int r10 = r9.size()
            if (r10 <= 0) goto L_0x00af
            java.lang.Object r9 = r9.get(r1)
            tb.cpb r9 = (tb.cpb) r9
            boolean r10 = r9 instanceof tb.tlc
            if (r10 == 0) goto L_0x00af
            tb.tlc r9 = (tb.tlc) r9
            boolean r9 = r9.isPlaying()
            if (r9 == 0) goto L_0x00af
            java.lang.String r9 = "1"
            goto L_0x00b1
        L_0x00af:
            java.lang.String r9 = "0"
        L_0x00b1:
            boolean r10 = tb.arq.a(r8)
            if (r10 != 0) goto L_0x00cb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r8 = ",is_show="
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
        L_0x00cb:
            boolean r9 = tb.arq.a(r7)
            if (r9 != 0) goto L_0x00f2
            boolean r9 = tb.arq.a(r0)
            if (r9 != 0) goto L_0x00ef
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = ",trackInfo="
            r9.append(r8)
            r9.append(r0)
            java.lang.String r8 = r9.toString()
            tb.s9m.a(r6, r7, r8)
            goto L_0x00f2
        L_0x00ef:
            tb.s9m.a(r6, r7, r8)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.b26.b(java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x022b  */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r25, java.lang.Object[] r26, com.taobao.android.dinamicx.DXRuntimeContext r27) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.b26.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
