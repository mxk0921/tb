package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SendMessageToZFB {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Resp extends BaseResp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Resp() {
        }

        public static /* synthetic */ Object ipc$super(Resp resp, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -738107024) {
                super.toBundle((Bundle) objArr[0]);
                return null;
            } else if (hashCode == 864909985) {
                super.fromBundle((Bundle) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/share/sdk/openapi/SendMessageToZFB$Resp");
            }
        }

        @Override // com.alipay.share.sdk.openapi.BaseResp
        public final boolean checkArgs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.alipay.share.sdk.openapi.BaseResp
        public void fromBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("338d7aa1", new Object[]{this, bundle});
            } else {
                super.fromBundle(bundle);
            }
        }

        @Override // com.alipay.share.sdk.openapi.BaseResp
        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // com.alipay.share.sdk.openapi.BaseResp
        public void toBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4016170", new Object[]{this, bundle});
            } else {
                super.toBundle(bundle);
            }
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Req extends BaseReq {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ZFBSceneSession = 0;
        public static final int ZFBSceneTimeLine = 1;
        public APMediaMessage message;
        public int scene = 0;

        public Req() {
        }

        public static /* synthetic */ Object ipc$super(Req req, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -738107024) {
                super.toBundle((Bundle) objArr[0]);
                return null;
            } else if (hashCode == 864909985) {
                super.fromBundle((Bundle) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/share/sdk/openapi/SendMessageToZFB$Req");
            }
        }

        @Override // com.alipay.share.sdk.openapi.BaseReq
        public final boolean checkArgs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
            }
            APMediaMessage aPMediaMessage = this.message;
            if (aPMediaMessage != null) {
                return aPMediaMessage.checkArgs();
            }
            Log.e("APSDK.SendToZFB.Req", "checkArgs fail ,message is null");
            return false;
        }

        @Override // com.alipay.share.sdk.openapi.BaseReq
        public void fromBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("338d7aa1", new Object[]{this, bundle});
                return;
            }
            super.fromBundle(bundle);
            this.message = APMediaMessage.Builder.fromBundle(bundle);
            this.scene = bundle.getInt(Constant.EXTRA_SEND_MESSAGE_SCENE);
        }

        @Override // com.alipay.share.sdk.openapi.BaseReq
        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // com.alipay.share.sdk.openapi.BaseReq
        public void toBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4016170", new Object[]{this, bundle});
                return;
            }
            super.toBundle(bundle);
            bundle.putAll(APMediaMessage.Builder.toBundle(this.message));
            bundle.putInt(Constant.EXTRA_SEND_MESSAGE_SCENE, this.scene);
        }

        public Req(Bundle bundle) {
            fromBundle(bundle);
        }
    }
}
