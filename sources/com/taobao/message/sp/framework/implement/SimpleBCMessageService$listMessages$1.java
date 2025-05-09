package com.taobao.message.sp.framework.implement;

import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.sp.framework.model.SimpleMessageListOriginal;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import com.taobao.tao.remotebusiness.IRemoteListener;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/taobao/message/sp/framework/implement/SimpleBCMessageService$listMessages$1", "Lcom/taobao/tao/remotebusiness/IRemoteListener;", "", "p0", "Lmtopsdk/mtop/domain/MtopResponse;", p1.d, "Lmtopsdk/mtop/domain/BaseOutDo;", "p2", "", "p3", "Ltb/xhv;", "onSuccess", "(ILmtopsdk/mtop/domain/MtopResponse;Lmtopsdk/mtop/domain/BaseOutDo;Ljava/lang/Object;)V", "onError", "(ILmtopsdk/mtop/domain/MtopResponse;Ljava/lang/Object;)V", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleBCMessageService$listMessages$1 implements IRemoteListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isNick;
    public final /* synthetic */ IObserver $observer;

    public SimpleBCMessageService$listMessages$1(boolean z, IObserver iObserver) {
        this.$isNick = z;
        this.$observer = iObserver;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.$observer.onError(new IllegalStateException(String.valueOf(i)));
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        ckf.h(mtopResponse, p1.d);
        Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.message.sp.framework.implement.SimpleBCMessageService$listMessages$1$onSuccess$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(SimpleBCMessageService$listMessages$1$onSuccess$1 simpleBCMessageService$listMessages$1$onSuccess$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/framework/implement/SimpleBCMessageService$listMessages$1$onSuccess$1");
            }

            @Override // com.taobao.message.kit.threadpool.BaseRunnable
            public void execute() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                    return;
                }
                try {
                    SimpleMessageListOriginal simpleMessageListOriginal = (SimpleMessageListOriginal) JSON.parseObject(mtopResponse.getDataJsonObject().toString(), SimpleMessageListOriginal.class);
                    SimpleMessageListResult simpleMessageListResult = new SimpleMessageListResult();
                    if (simpleMessageListOriginal != null) {
                        simpleMessageListResult.messageList = SimpleMessageListOriginal.parse(simpleMessageListOriginal.userMessages, SimpleBCMessageService$listMessages$1.this.$isNick);
                        simpleMessageListResult.hasMore = simpleMessageListOriginal.hasMore;
                        simpleMessageListResult.nextCursor = simpleMessageListOriginal.nextCursor;
                    }
                    SimpleBCMessageService$listMessages$1.this.$observer.onNext(simpleMessageListResult);
                    SimpleBCMessageService$listMessages$1.this.$observer.onComplete();
                } catch (Throwable th) {
                    SimpleBCMessageService$listMessages$1.this.$observer.onError(th);
                }
            }
        });
    }
}
