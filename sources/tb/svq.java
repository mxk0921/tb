package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeTopicList;
import com.taobao.message.subscribe.SubscribeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.fut;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class svq implements itd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jtd f28304a;

        public a(jtd jtdVar) {
            this.f28304a = jtdVar;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
            } else if (subScribeCenterResultDTO instanceof SubScribeCenterResultDTO) {
                nuq c = svq.this.c(subScribeCenterResultDTO);
                new StringBuilder("subscribeLiveTopic onNext getRetCode = ").append(subScribeCenterResultDTO.getRetCode());
                ((fut.e) this.f28304a).c(c);
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else {
                ((fut.e) this.f28304a).a();
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                ((fut.e) this.f28304a).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jtd f28305a;

        public b(jtd jtdVar) {
            this.f28305a = jtdVar;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
            } else if (subScribeCenterResultDTO instanceof SubScribeCenterResultDTO) {
                ((fut.e) this.f28305a).c(svq.this.c(subScribeCenterResultDTO));
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else {
                ((fut.e) this.f28305a).a();
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                ((fut.e) this.f28305a).b();
            }
        }
    }

    static {
        t2o.a(779092374);
        t2o.a(806355937);
    }

    @Override // tb.itd
    public void a(String str, String str2, String str3, Context context, jtd jtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d7563", new Object[]{this, str, str2, str3, context, jtdVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            SubscribeUtils.INSTANCE.doSubscribe(str, str3, null, str2, new a(jtdVar));
        }
    }

    @Override // tb.itd
    public void b(String str, String str2, String str3, Context context, jtd jtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd015c9", new Object[]{this, str, str2, str3, context, jtdVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            SubscribeUtils.INSTANCE.cancelSubscribe(str, str3, null, str2, new b(jtdVar));
        }
    }

    public nuq c(SubScribeCenterResultDTO subScribeCenterResultDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nuq) ipChange.ipc$dispatch("7ae0c7a2", new Object[]{this, subScribeCenterResultDTO});
        }
        nuq nuqVar = new nuq();
        List<SubScribeTopicList> subScribeTopicList = subScribeCenterResultDTO.getSubScribeTopicList();
        if (subScribeTopicList != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < subScribeTopicList.size(); i++) {
                SubScribeTopicList subScribeTopicList2 = subScribeTopicList.get(i);
                ouq ouqVar = new ouq();
                if (!TextUtils.isEmpty(subScribeTopicList2.getErrCode())) {
                    ouqVar.c(subScribeTopicList2.getErrCode());
                }
                if (!TextUtils.isEmpty(subScribeTopicList2.getStatus())) {
                    ouqVar.d(subScribeTopicList2.getStatus());
                }
                if (!TextUtils.isEmpty(subScribeTopicList2.getTopicId())) {
                    ouqVar.e(subScribeTopicList2.getTopicId());
                }
                arrayList.add(ouqVar);
            }
            nuqVar.f(arrayList);
        }
        if (!TextUtils.isEmpty(subScribeCenterResultDTO.getRetCode())) {
            nuqVar.d(subScribeCenterResultDTO.getRetCode());
        }
        if (!TextUtils.isEmpty(subScribeCenterResultDTO.getRetMsg())) {
            nuqVar.e(subScribeCenterResultDTO.getRetMsg());
        }
        if (!TextUtils.isEmpty(subScribeCenterResultDTO.getToastText())) {
            nuqVar.h(subScribeCenterResultDTO.getToastText());
        }
        Map<String, Object> subscribeConfirmResponse = subScribeCenterResultDTO.getSubscribeConfirmResponse();
        if (subscribeConfirmResponse != null) {
            nuqVar.g(subscribeConfirmResponse);
        }
        List<String> errTopicId = subScribeCenterResultDTO.getErrTopicId();
        if (errTopicId != null) {
            nuqVar.c(errTopicId);
        }
        return nuqVar;
    }
}
