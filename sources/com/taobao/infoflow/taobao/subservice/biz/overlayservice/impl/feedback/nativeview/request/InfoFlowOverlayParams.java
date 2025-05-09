package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class InfoFlowOverlayParams implements IMTOPDataObject {
    public String appId;
    public String params;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10765a;
        public String b;

        static {
            t2o.a(491782494);
        }

        public InfoFlowOverlayParams a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InfoFlowOverlayParams) ipChange.ipc$dispatch("48570caf", new Object[]{this});
            }
            return new InfoFlowOverlayParams(this);
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("338632ca", new Object[]{this, str});
            }
            this.f10765a = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d73dac40", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(491782493);
        t2o.a(589299906);
    }

    public InfoFlowOverlayParams(a aVar) {
        this.appId = aVar.f10765a;
        this.params = aVar.b;
    }
}
