package com.taobao.share.core.contacts.mtop.response;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareCheckResponse extends BaseOutDo implements Serializable {
    public ShareCheckResponseData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ShareCheckResponseData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean canSend;
        public String noSendCode;
        public String noSendMsg;
        public String sendUrl;

        static {
            t2o.a(664797240);
        }

        public String getNoSendCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("164e40d", new Object[]{this});
            }
            return this.noSendCode;
        }

        public String getNoSendMsg() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b6ad517", new Object[]{this});
            }
            return this.noSendMsg;
        }

        public String getSendUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b34d3708", new Object[]{this});
            }
            return this.sendUrl;
        }

        public boolean isCanSend() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d3c40079", new Object[]{this})).booleanValue();
            }
            return this.canSend;
        }

        public void setCanSend(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69595c37", new Object[]{this, new Boolean(z)});
            } else {
                this.canSend = z;
            }
        }

        public void setNoSendCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2212509", new Object[]{this, str});
            } else {
                this.noSendCode = str;
            }
        }

        public void setNoSendMsg(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e42d89a7", new Object[]{this, str});
            } else {
                this.noSendMsg = str;
            }
        }

        public void setSendUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd5d32d6", new Object[]{this, str});
            } else {
                this.sendUrl = str;
            }
        }
    }

    static {
        t2o.a(664797239);
    }

    public void setData(ShareCheckResponseData shareCheckResponseData) {
        this.data = shareCheckResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ShareCheckResponseData getData() {
        return this.data;
    }
}
