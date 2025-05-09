package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o95 implements qvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f25224a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a9e f25225a;

        public a(a9e a9eVar) {
            this.f25225a = a9eVar;
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            } else if (this.f25225a != null) {
                MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
                if (dWResponse != null) {
                    mediaVideoResponse.data = dWResponse.data;
                    mediaVideoResponse.errorCode = dWResponse.errorCode;
                    mediaVideoResponse.errorMsg = dWResponse.errorMsg;
                }
                this.f25225a.a(mediaVideoResponse);
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                return;
            }
            if (!(dWResponse == null || dWResponse.data == null)) {
                o95.this.f25224a.setDWConfigObject(new c75(dWResponse.data));
            }
            if (this.f25225a != null) {
                MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
                if (dWResponse != null) {
                    mediaVideoResponse.data = dWResponse.data;
                    mediaVideoResponse.errorCode = dWResponse.errorCode;
                    mediaVideoResponse.errorMsg = dWResponse.errorMsg;
                }
                this.f25225a.b(mediaVideoResponse);
            }
        }
    }

    static {
        t2o.a(452984950);
        t2o.a(774897763);
    }

    public o95(DWContext dWContext) {
        this.f25224a = dWContext;
    }

    @Override // tb.qvd
    public void a(a9e a9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab971ca5", new Object[]{this, a9eVar});
            return;
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWTBVideoSourceAdapter);
        this.f25224a.queryVideoConfigData2(new a(a9eVar), false);
    }
}
