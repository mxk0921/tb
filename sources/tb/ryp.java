package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ryp implements z6e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CANCEL = "101";
    public static final String CUSTOM_ERROR_CODE = "99999";
    public static final String FILE_TYPE_IMAGE_JPG = "jpg";
    public static final String FILE_TYPE_VIDEO_MP4 = "mp4";
    public static final String TIME_OUT_ERROR = "100";

    /* renamed from: a  reason: collision with root package name */
    public String f27681a;
    public String b;
    public String c;

    static {
        t2o.a(511705199);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8812494", new Object[]{this, str});
            return;
        }
        this.f27681a = str;
        if (!TextUtils.isEmpty(str)) {
            new File(str).length();
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d2a1e9", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    @Override // tb.z6e
    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.z6e
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        return this.f27681a;
    }

    @Override // tb.z6e
    public String getFileType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
        }
        return this.c;
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
