package com.android.dingtalk.share.ddsharemodule.message;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SendMessageToDD {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Resp extends BaseResp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(90177568);
        }

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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/android/dingtalk/share/ddsharemodule/message/SendMessageToDD$Resp");
            }
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseResp
        public final boolean checkArgs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseResp
        public void fromBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("338d7aa1", new Object[]{this, bundle});
            } else {
                super.fromBundle(bundle);
            }
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseResp
        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseResp
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

    static {
        t2o.a(90177566);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Req extends BaseReq {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DDSceneSession = 0;
        private static final String TAG = "SendMessageToDD.Req";
        public DDMediaMessage mMediaMessage;
        private int mScene = 0;

        static {
            t2o.a(90177567);
        }

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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/android/dingtalk/share/ddsharemodule/message/SendMessageToDD$Req");
            }
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public void attachContext(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
                return;
            }
            DDMediaMessage dDMediaMessage = this.mMediaMessage;
            if (dDMediaMessage != null) {
                dDMediaMessage.attachContext(context);
            }
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public final boolean checkArgs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
            }
            DDMediaMessage dDMediaMessage = this.mMediaMessage;
            if (dDMediaMessage != null) {
                return dDMediaMessage.checkArgs();
            }
            Log.e(TAG, "checkArgs fail ,message is null");
            return false;
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public void fromBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("338d7aa1", new Object[]{this, bundle});
                return;
            }
            super.fromBundle(bundle);
            if (bundle != null) {
                this.mMediaMessage = DDMediaMessage.Builder.fromBundle(bundle);
                this.mScene = bundle.getInt(ShareConstant.EXTRA_SEND_MESSAGE_SCENE);
            }
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public int getSupportVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6cc357f9", new Object[]{this})).intValue();
            }
            DDMediaMessage dDMediaMessage = this.mMediaMessage;
            if (dDMediaMessage == null) {
                return Integer.MAX_VALUE;
            }
            return dDMediaMessage.getSupportVersion();
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return this.mMediaMessage.getType();
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public void toBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4016170", new Object[]{this, bundle});
                return;
            }
            super.toBundle(bundle);
            if (bundle != null) {
                bundle.putAll(DDMediaMessage.Builder.toBundle(this.mMediaMessage));
                bundle.putInt(ShareConstant.EXTRA_SEND_MESSAGE_SCENE, this.mScene);
            }
        }

        public Req(Bundle bundle) {
            fromBundle(bundle);
        }
    }
}
