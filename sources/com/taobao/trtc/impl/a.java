package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcCallInterface;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.impl.TrtcInnerDefines;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.trtc.impl.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0784a implements ITrtcCallInterface.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TrtcEngineImpl f13932a;
        public final TrtcInnerDefines.TrtcAnswerCallParams b = new TrtcInnerDefines.TrtcAnswerCallParams();

        static {
            t2o.a(395313489);
            t2o.a(395313376);
        }

        public C0784a(TrtcEngineImpl trtcEngineImpl) {
            this.f13932a = trtcEngineImpl;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("b84a8f83", new Object[]{this, str});
            }
            this.b.subType = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("85a0bdf5", new Object[]{this, new Boolean(z)});
            }
            this.b.isMultiChatMode = z;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a e(ITrtcInputStream iTrtcInputStream) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("b961c040", new Object[]{this, iTrtcInputStream});
            }
            this.b.inputStream = iTrtcInputStream;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a f(TrtcDefines.TrtcAnswerType trtcAnswerType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("b5ea6ba8", new Object[]{this, trtcAnswerType});
            }
            this.b.answerType = trtcAnswerType.ordinal();
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a g(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("36f4772a", new Object[]{this, str, str2});
            }
            TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams = this.b;
            trtcAnswerCallParams.remoteUserId = str;
            trtcAnswerCallParams.extension = str2;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public boolean start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
            }
            TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams = this.b;
            trtcAnswerCallParams.mediaConfig = TrtcEngineImpl.W0(trtcAnswerCallParams.inputStream);
            return this.f13932a.f0(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements ITrtcCallInterface.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TrtcEngineImpl f13933a;
        public final TrtcInnerDefines.TrtcCancelCallParams b;

        static {
            t2o.a(395313490);
            t2o.a(395313377);
        }

        public b(TrtcEngineImpl trtcEngineImpl) {
            this.f13933a = trtcEngineImpl;
            TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams = new TrtcInnerDefines.TrtcCancelCallParams();
            this.b = trtcCancelCallParams;
            trtcCancelCallParams.userInfos = new ArrayList<>();
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.b
        public ITrtcCallInterface.b b(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.b) ipChange.ipc$dispatch("7c936e9c", new Object[]{this, str, trtcUserRole, str2, str3});
            }
            a.a(this.b.userInfos, str, trtcUserRole, str2, str3);
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.b
        public boolean start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
            }
            return this.f13933a.i0(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements ITrtcCallInterface.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TrtcEngineImpl f13934a;
        public final TrtcInnerDefines.TrtcHangUpCallParams b;

        static {
            t2o.a(395313491);
            t2o.a(395313378);
        }

        public c(TrtcEngineImpl trtcEngineImpl) {
            this.f13934a = trtcEngineImpl;
            TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams = new TrtcInnerDefines.TrtcHangUpCallParams();
            this.b = trtcHangUpCallParams;
            trtcHangUpCallParams.userInfos = new ArrayList<>();
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("4a61be14", new Object[]{this, str});
            }
            this.b.subType = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c b(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("59c6b669", new Object[]{this, str, trtcUserRole, str2, str3});
            }
            a.a(this.b.userInfos, str, trtcUserRole, str2, str3);
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("17b7ec86", new Object[]{this, new Boolean(z)});
            }
            this.b.isMultiChatMode = z;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("8e226ff1", new Object[]{this, str});
            }
            a.a(this.b.userInfos, str, TrtcDefines.TrtcUserRole.E_ROLE_FANS_OR_CALL, "", "");
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("d842ec79", new Object[]{this, str});
            }
            this.b.extension = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public boolean start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
            }
            return this.f13934a.y0(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements ITrtcCallInterface.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TrtcEngineImpl f13935a;
        public final TrtcInnerDefines.TrtcMakeCallParams b;

        static {
            t2o.a(395313492);
            t2o.a(395313379);
        }

        public d(TrtcEngineImpl trtcEngineImpl) {
            this.f13935a = trtcEngineImpl;
            TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams = new TrtcInnerDefines.TrtcMakeCallParams();
            this.b = trtcMakeCallParams;
            trtcMakeCallParams.userInfos = new ArrayList<>();
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("52a41853", new Object[]{this, str});
            }
            this.b.subType = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d b(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("3e2521e8", new Object[]{this, str, trtcUserRole, str2, str3});
            }
            a.a(this.b.userInfos, str, trtcUserRole, str2, str3);
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("38373b45", new Object[]{this, new Boolean(z)});
            }
            this.b.isMultiChatMode = z;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("8d76bfd8", new Object[]{this, str});
            }
            TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams = this.b;
            if (str == null) {
                str = "";
            }
            trtcMakeCallParams.extension = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d e(ITrtcInputStream iTrtcInputStream) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("e85a5450", new Object[]{this, iTrtcInputStream});
            }
            this.b.inputStream = iTrtcInputStream;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("fb4de878", new Object[]{this, new Integer(i)});
            }
            this.b.maxChatUserNumber = i;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public boolean start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
            }
            TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams = this.b;
            trtcMakeCallParams.mediaConfig = TrtcEngineImpl.W0(trtcMakeCallParams.inputStream);
            return this.f13935a.O0(this.b);
        }
    }

    static {
        t2o.a(395313488);
    }

    public static /* synthetic */ void a(ArrayList arrayList, String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60dda55", new Object[]{arrayList, str, trtcUserRole, str2, str3});
        } else {
            b(arrayList, str, trtcUserRole, str2, str3);
        }
    }

    public static void b(ArrayList<TrtcInnerDefines.TrtcCallUserInfo> arrayList, String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5b31d0", new Object[]{arrayList, str, trtcUserRole, str2, str3});
        } else if (str != null) {
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                TrtcInnerDefines.TrtcCallUserInfo next = it.next();
                if (next.userId.equals(str)) {
                    next.deviceId = str2;
                    next.extension = str3;
                    next.role = trtcUserRole.ordinal();
                    return;
                }
            }
            arrayList.add(c(str, trtcUserRole, str2, str3));
        }
    }

    public static TrtcInnerDefines.TrtcCallUserInfo c(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInnerDefines.TrtcCallUserInfo) ipChange.ipc$dispatch("84a102ea", new Object[]{str, trtcUserRole, str2, str3});
        }
        TrtcInnerDefines.TrtcCallUserInfo trtcCallUserInfo = new TrtcInnerDefines.TrtcCallUserInfo();
        trtcCallUserInfo.customInfo = new HashMap();
        trtcCallUserInfo.extension = str3;
        trtcCallUserInfo.userId = str;
        trtcCallUserInfo.deviceId = str2;
        trtcCallUserInfo.role = trtcUserRole.ordinal();
        return trtcCallUserInfo;
    }

    public static String d(TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a0a71fc", new Object[]{trtcAnswerCallParams});
        }
        StringBuilder sb = new StringBuilder("{ remote user id: ");
        sb.append(trtcAnswerCallParams.remoteUserId);
        ITrtcInputStream iTrtcInputStream = trtcAnswerCallParams.inputStream;
        if (iTrtcInputStream != null) {
            str = iTrtcInputStream.streamId();
        } else {
            str = "null";
        }
        sb.append(", input stream id: ");
        sb.append(str);
        sb.append(", answer type: ");
        sb.append(TrtcDefines.TrtcAnswerType.values()[trtcAnswerCallParams.answerType]);
        sb.append(", extension: ");
        sb.append(trtcAnswerCallParams.extension);
        sb.append(" } ");
        return sb.toString();
    }

    public static String e(TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7598efb8", new Object[]{trtcCancelCallParams});
        }
        return "{ " + h(trtcCancelCallParams.userInfos) + " } ";
    }

    public static String f(TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82d31cab", new Object[]{trtcHangUpCallParams});
        }
        return "{ " + h(trtcHangUpCallParams.userInfos) + " } ";
    }

    public static String g(TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deb66cac", new Object[]{trtcMakeCallParams});
        }
        StringBuilder sb = new StringBuilder("{ ");
        sb.append(h(trtcMakeCallParams.userInfos));
        sb.append(", timeout: ");
        sb.append(trtcMakeCallParams.callTimeout);
        ITrtcInputStream iTrtcInputStream = trtcMakeCallParams.inputStream;
        if (iTrtcInputStream != null) {
            str = iTrtcInputStream.streamId();
        } else {
            str = "null";
        }
        sb.append(", input stream id: ");
        sb.append(str);
        sb.append(" } ");
        return sb.toString();
    }

    public static String h(ArrayList<TrtcInnerDefines.TrtcCallUserInfo> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ad67d03", new Object[]{arrayList});
        }
        StringBuilder sb = new StringBuilder();
        Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            TrtcInnerDefines.TrtcCallUserInfo next = it.next();
            sb.append("|");
            String str = next.userId;
            if (str != null && !str.isEmpty()) {
                sb.append(" userId: ");
                sb.append(next.userId);
            }
            sb.append(" role: ");
            sb.append(next.role);
            String str2 = next.deviceId;
            if (str2 != null && !str2.isEmpty()) {
                sb.append(" device id: ");
                sb.append(next.deviceId);
            }
            String str3 = next.extension;
            if (str3 != null && !str3.isEmpty()) {
                sb.append(" extension: ");
                sb.append(next.extension);
            }
            Map<String, String> map = next.customInfo;
            if (map != null && !map.isEmpty()) {
                sb.append(" custom info: ");
                sb.append(next.customInfo.toString());
            }
            sb.append(" |");
        }
        return sb.toString();
    }
}
