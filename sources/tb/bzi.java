package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bzi implements wnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements z6e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(bzi bziVar) {
        }

        @Override // tb.z6e
        public String getBizType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
            }
            return "msg-monitor";
        }

        @Override // tb.z6e
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
            }
            return p2j.h.getDatabasePath("message_kit").getAbsolutePath();
        }

        @Override // tb.z6e
        public String getFileType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
            }
            return ".db";
        }

        @Override // tb.z6e
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements mzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(bzi bziVar) {
        }

        @Override // tb.mzd
        public void onCancel(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onFailure(z6e z6eVar, ndt ndtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
            } else {
                MsgLog.e("MonitorCmdProcessor", "fail to upload monitor");
            }
        }

        @Override // tb.mzd
        public void onPause(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onProgress(z6e z6eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
            }
        }

        @Override // tb.mzd
        public void onResume(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onStart(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onWait(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onSuccess(z6e z6eVar, ozd ozdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
            } else {
                MsgLog.e("MonitorCmdProcessor", "uploaded monitor");
            }
        }
    }

    @Override // tb.wnb
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("525af3e5", new Object[]{this, command});
        }
        if (command.header.c == 1000) {
            MsgLog.e("MonitorCmdProcessor", "start to upload monitor");
            omv.a().uploadAsync(new a(this), new b(this), null);
        }
        return null;
    }
}
