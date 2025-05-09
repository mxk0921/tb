package com.taobao.android.tbabilitykit.weex.pop.render;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import tb.a8;
import tb.b8;
import tb.c8;
import tb.f8;
import tb.t2o;
import tb.u8;
import tb.ye2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TAKAbilityHubModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f9542a;

        public a(JSCallback jSCallback) {
            this.f9542a = jSCallback;
        }

        @Override // tb.u8
        public void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else if (this.f9542a != null) {
                if (c8Var instanceof b8) {
                    Object a2 = c8Var.a();
                    if (a2 instanceof a8) {
                        a8 a8Var = (a8) a2;
                        TAKAbilityHubModule.access$000(TAKAbilityHubModule.this, str, a8Var.a(), a8Var.b(), this.f9542a);
                        return;
                    }
                    TAKAbilityHubModule.access$000(TAKAbilityHubModule.this, str, -1, "未知错误", this.f9542a);
                } else if (c8Var instanceof f8) {
                    TAKAbilityHubModule.access$100(TAKAbilityHubModule.this, str, c8Var.a(), this.f9542a);
                }
            }
        }
    }

    static {
        t2o.a(786432145);
    }

    public static /* synthetic */ void access$000(TAKAbilityHubModule tAKAbilityHubModule, String str, int i, String str2, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7060c9", new Object[]{tAKAbilityHubModule, str, new Integer(i), str2, jSCallback});
        } else {
            tAKAbilityHubModule.errorCallback(str, i, str2, jSCallback);
        }
    }

    public static /* synthetic */ void access$100(TAKAbilityHubModule tAKAbilityHubModule, String str, Object obj, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad9a9bf", new Object[]{tAKAbilityHubModule, str, obj, jSCallback});
        } else {
            tAKAbilityHubModule.successCallback(str, obj, jSCallback);
        }
    }

    private void errorCallback(String str, int i, String str2, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afecfa19", new Object[]{this, str, new Integer(i), str2, jSCallback});
        } else if (jSCallback != null) {
            jSCallback.invoke(ye2.c(str, i, str2));
        }
    }

    public static /* synthetic */ Object ipc$super(TAKAbilityHubModule tAKAbilityHubModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/weex/pop/render/TAKAbilityHubModule");
    }

    private void successCallback(String str, Object obj, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cf4ed3", new Object[]{this, str, obj, jSCallback});
        } else if (jSCallback != null) {
            jSCallback.invoke(ye2.d(str, obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @com.taobao.weex.annotation.JSMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatch(java.lang.String r6, com.alibaba.fastjson.JSONObject r7, com.taobao.weex.bridge.JSCallback r8) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "59bf01a3"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r6
            r6 = 2
            r2[r6] = r7
            r6 = 3
            r2[r6] = r8
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            com.taobao.weex.WXSDKInstance r0 = r5.mWXSDKInstance
            if (r0 != 0) goto L_0x0029
            java.lang.String r6 = "内部错误"
            java.lang.String r7 = ""
            r0 = -1
            r5.errorCallback(r7, r0, r6, r8)
            return
        L_0x0029:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = "type"
            r0.put(r1, r6)
        L_0x003a:
            if (r7 == 0) goto L_0x0042
            java.lang.String r6 = "params"
            r0.put(r6, r7)
        L_0x0042:
            com.taobao.weex.WXSDKInstance r6 = r5.mWXSDKInstance
            android.view.View r6 = r6.getContainerView()
            r7 = 0
            if (r6 == 0) goto L_0x0058
            int r1 = com.taobao.taobao.R.id.tak_pop_ability_engine_tag
            java.lang.Object r1 = r6.getTag(r1)
            boolean r2 = r1 instanceof tb.y7
            if (r2 == 0) goto L_0x0058
            tb.y7 r1 = (tb.y7) r1
            goto L_0x0059
        L_0x0058:
            r1 = r7
        L_0x0059:
            if (r1 != 0) goto L_0x006a
            tb.y7 r1 = new tb.y7
            tb.zq r2 = new tb.zq
            java.lang.String r3 = "AbilityKit"
            java.lang.String r4 = "weex_hub"
            r2.<init>(r3, r4)
            r1.<init>(r2, r7)
        L_0x006a:
            tb.n9 r7 = new tb.n9
            r7.<init>()
            com.taobao.weex.WXSDKInstance r2 = r5.mWXSDKInstance
            android.content.Context r2 = r2.a0()
            r7.i(r2)
            r7.m(r6)
            tb.n8 r6 = new tb.n8
            r6.<init>(r0)
            com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule$a r0 = new com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule$a
            r0.<init>(r8)
            r1.b(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule.dispatch(java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.weex.bridge.JSCallback):void");
    }
}
