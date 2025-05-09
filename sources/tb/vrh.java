package tb;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vrh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Object> mArgsMap;
    private String mBizName;
    private String mInvokeClass;
    private String mInvokePage;
    private String mInvokePageUrl;
    private int mPlatform;
    private urh mRequest;
    private String mSceneName;
    private String mServiceId;
    private String mVersion;
    private String mSamplingRate = "1.0";
    private String mMsoaVersion = "2.0";

    public vrh(String str, Map<String, Object> map) {
        ComponentName componentName;
        MSOAServiceInvoke mSOAServiceInvoke = (MSOAServiceInvoke) getClass().getAnnotation(MSOAServiceInvoke.class);
        if (mSOAServiceInvoke != null) {
            this.mBizName = mSOAServiceInvoke.bizName();
            this.mServiceId = mSOAServiceInvoke.serviceId();
            this.mVersion = mSOAServiceInvoke.version();
            if (TextUtils.isEmpty(this.mBizName) || TextUtils.isEmpty(this.mServiceId) || TextUtils.isEmpty(this.mVersion)) {
                throw new IllegalArgumentException("MSOAServiceInvoke annotation should have bizName and serviceId and version");
            }
            try {
                this.mInvokeClass = Thread.currentThread().getStackTrace()[3].getClassName();
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) Globals.getApplication().getApplicationContext().getSystemService("activity")).getRunningTasks(1);
                if (runningTasks != null) {
                    componentName = runningTasks.get(0).topActivity;
                    this.mInvokePage = componentName.getClassName();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.mSceneName = str;
            this.mArgsMap = map;
            this.mPlatform = MSOAServiceDefinition.Platform.NATIVE.value();
            if (!TextUtils.isEmpty(this.mSceneName)) {
                urh urhVar = new urh(this.mServiceId, this.mVersion, this.mBizName, this.mSceneName, this.mArgsMap);
                this.mRequest = urhVar;
                urhVar.l = this.mSamplingRate;
                urhVar.m = this.mInvokeClass;
                urhVar.n = this.mInvokePage;
                urhVar.p = this.mMsoaVersion;
                return;
            }
            throw new IllegalArgumentException("params sceneName can not be null or empty");
        }
        throw new IllegalArgumentException("MSOARequestV2 must be annotated with MSOAServiceInvoke");
    }

    public urh getRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (urh) ipChange.ipc$dispatch("e97ced3e", new Object[]{this});
        }
        return this.mRequest;
    }

    public vrh(String str, String str2, String str3, String str4, Map<String, Object> map) {
        ComponentName componentName;
        this.mBizName = str;
        this.mServiceId = str2;
        this.mVersion = str3;
        try {
            this.mInvokeClass = Thread.currentThread().getStackTrace()[3].getClassName();
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) Globals.getApplication().getApplicationContext().getSystemService("activity")).getRunningTasks(1);
            if (runningTasks != null) {
                componentName = runningTasks.get(0).topActivity;
                this.mInvokePage = componentName.getClassName();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mSceneName = str4;
        this.mArgsMap = map;
        this.mPlatform = MSOAServiceDefinition.Platform.NATIVE.value();
        if (TextUtils.isEmpty(this.mBizName) || TextUtils.isEmpty(this.mServiceId) || TextUtils.isEmpty(this.mVersion) || TextUtils.isEmpty(this.mSceneName)) {
            throw new IllegalArgumentException("params bizName serviceId version sceneName all can not be null or empty");
        }
        urh urhVar = new urh(this.mServiceId, this.mVersion, this.mBizName, this.mSceneName, this.mArgsMap);
        this.mRequest = urhVar;
        urhVar.l = this.mSamplingRate;
        urhVar.m = this.mInvokeClass;
        urhVar.n = this.mInvokePage;
        urhVar.p = this.mMsoaVersion;
    }

    public vrh(String str, String str2, String str3, String str4, String str5, Map<String, Object> map, int i) {
        ComponentName componentName;
        this.mBizName = str;
        this.mServiceId = str2;
        this.mVersion = str3;
        try {
            this.mInvokeClass = Thread.currentThread().getStackTrace()[3].getClassName();
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) Globals.getApplication().getApplicationContext().getSystemService("activity")).getRunningTasks(1);
            if (runningTasks != null) {
                componentName = runningTasks.get(0).topActivity;
                this.mInvokePage = componentName.getClassName();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mInvokePageUrl = str4;
        this.mSceneName = str5;
        this.mArgsMap = map;
        this.mPlatform = i;
        if (TextUtils.isEmpty(this.mBizName) || TextUtils.isEmpty(this.mServiceId) || TextUtils.isEmpty(this.mVersion) || TextUtils.isEmpty(this.mInvokePageUrl) || TextUtils.isEmpty(this.mSceneName)) {
            throw new IllegalArgumentException("params bizName serviceId version invokePageUrl sceneName all can not be null or empty");
        }
        urh urhVar = new urh(this.mServiceId, this.mVersion, this.mBizName, this.mSceneName, this.mArgsMap, this.mPlatform);
        this.mRequest = urhVar;
        urhVar.l = this.mSamplingRate;
        urhVar.m = this.mInvokeClass;
        urhVar.n = this.mInvokePage;
        urhVar.o = this.mInvokePageUrl;
        urhVar.p = this.mMsoaVersion;
    }
}
