package com.taobao.oversea.mytaobao;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.oversea.mytaobao.SecScreenLoadMoreManager;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ob5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RECYCLERVIEWLOADMORE = 1123213624583578651L;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/mytaobao/DXRecyclerViewLoadMoreEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            SecScreenLoadMoreManager.e().g(new C0647a(this, dXRuntimeContext));
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

    /* compiled from: Taobao */
    /* renamed from: com.taobao.oversea.mytaobao.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0647a implements SecScreenLoadMoreManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f11443a;

        public C0647a(a aVar, DXRuntimeContext dXRuntimeContext) {
            this.f11443a = dXRuntimeContext;
        }

        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                return;
            }
            DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_LOADMORESTRATEGY);
            dXMsgCenterEvent.setType("General");
            dXMsgCenterEvent.setMethod(DXRecyclerLayout.MSG_METHOD_LOAD_MORE);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "failed");
            dXMsgCenterEvent.setParams(jSONObject);
            this.f11443a.W().postEvent(dXMsgCenterEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
            if (r4.getBoolean("end").booleanValue() != false) goto L_0x00e0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:
            r2.put("status", (java.lang.Object) com.taobao.android.dinamicx.widget.DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x012b, code lost:
            if (r4.getBoolean("end").booleanValue() != false) goto L_0x00e0;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(mtopsdk.mtop.domain.MtopResponse r18, mtopsdk.mtop.domain.BaseOutDo r19) {
            /*
                Method dump skipped, instructions count: 377
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.oversea.mytaobao.a.C0647a.b(mtopsdk.mtop.domain.MtopResponse, mtopsdk.mtop.domain.BaseOutDo):void");
        }
    }
}
