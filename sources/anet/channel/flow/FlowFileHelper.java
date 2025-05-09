package anet.channel.flow;

import anet.channel.encode.FileHelper;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FlowFileHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_FILE_NAME = "flow_stat";
    public static final String DEFAULT_PATH = "awcn_flow_dir/";
    public static final String DEFAULT_TEMPORARY_PATH = "awcn_flow_temporary_dir/";
    public static final String FLOW_TAG = "[flow]";
    private static final String TAG = "awcn.FlowFileHelper";
    private static File defaultFilePath = null;

    static {
        t2o.a(607125642);
    }

    public static synchronized void updateData(String str) {
        synchronized (FlowFileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2aa64", new Object[]{str});
                return;
            }
            if (defaultFilePath == null) {
                defaultFilePath = FileHelper.getDefaultFilePath(str, DEFAULT_PATH, FLOW_TAG);
            }
            File[] listFiles = defaultFilePath.listFiles();
            for (int i = 0; listFiles != null && i < listFiles.length; i++) {
                File file = listFiles[i];
                if (!file.isDirectory()) {
                    try {
                        if (DEFAULT_FILE_NAME.equalsIgnoreCase(file.getName())) {
                            file.delete();
                        }
                    } catch (Exception unused) {
                        ALog.e(TAG, "[flow]updateData delete file failed.", str, new Object[0]);
                    }
                }
            }
            FileHelper.updateFile(FlowStatHelper.flowAttributesHashMap, new File(defaultFilePath, DEFAULT_FILE_NAME), DEFAULT_FILE_NAME, str, DEFAULT_TEMPORARY_PATH, FLOW_TAG);
        }
    }
}
