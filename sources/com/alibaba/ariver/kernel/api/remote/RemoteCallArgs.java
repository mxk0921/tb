package com.alibaba.ariver.kernel.api.remote;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RemoteCallArgs implements Parcelable {
    private String action;
    private String[] argTypes;
    private Object[] args;
    private String className;
    private Parcelable data;
    private Map<String, Object> extraData;
    private String method;
    private Node node;
    private long nodeId;
    private int pid;
    private int remoteSignature;
    private String sourceProcessName;
    private static AtomicInteger sAtomicIndex = new AtomicInteger(0);
    public static final Parcelable.Creator<RemoteCallArgs> CREATOR = new Parcelable.Creator<RemoteCallArgs>() { // from class: com.alibaba.ariver.kernel.api.remote.RemoteCallArgs.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteCallArgs createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RemoteCallArgs) ipChange.ipc$dispatch("17cdbfe2", new Object[]{this, parcel}) : new RemoteCallArgs(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteCallArgs[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RemoteCallArgs[]) ipChange.ipc$dispatch("573c5499", new Object[]{this, new Integer(i)}) : new RemoteCallArgs[i];
        }
    };

    public RemoteCallArgs(Node node, Extension extension, Method method, Object[] objArr, Parcelable parcelable) {
        this(node != null ? node.getNodeId() : 0L, extension.getClass().getName(), method, objArr);
        this.node = node;
        this.data = parcelable;
    }

    public void addExtraData(String str, Object obj) {
        if (this.extraData == null) {
            this.extraData = new HashMap();
        }
        this.extraData.put(str, obj);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.action;
    }

    public String[] getArgTypes() {
        return this.argTypes;
    }

    public Object[] getArgs() {
        return this.args;
    }

    public String getClassName() {
        return this.className;
    }

    public Parcelable getData() {
        return this.data;
    }

    public Object getExtraData(String str) {
        Map<String, Object> map = this.extraData;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public String getMethodName() {
        return this.method;
    }

    public Node getNode() {
        return this.node;
    }

    public long getNodeId() {
        return this.nodeId;
    }

    public int getPid() {
        return this.pid;
    }

    public int getRemoteSignature() {
        return this.remoteSignature;
    }

    public String getSourceProcessName() {
        return this.sourceProcessName;
    }

    public String toString() {
        return "RemoteCallArgs{pid=" + this.pid + ", node=" + this.node + ", sourceProcessName=" + this.sourceProcessName + ", className=" + this.className + ", method=" + this.method + ", arg=" + this.args + ", argTypes=" + Arrays.toString(this.argTypes) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.pid);
        parcel.writeString(this.sourceProcessName);
        parcel.writeLong(this.nodeId);
        parcel.writeParcelable(this.node, 0);
        parcel.writeString(this.className);
        parcel.writeString(this.method);
        parcel.writeString(this.action);
        parcel.writeInt(this.remoteSignature);
        Object[] objArr = this.args;
        if (objArr == null) {
            i2 = 0;
        } else {
            i2 = objArr.length;
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            parcel.writeStringArray(this.argTypes);
            parcel.writeArray(this.args);
        }
        parcel.writeParcelable(this.data, 0);
        if (this.extraData != null) {
            parcel.writeByte((byte) 1);
            parcel.writeMap(this.extraData);
            return;
        }
        parcel.writeByte((byte) 0);
    }

    private RemoteCallArgs(long j, String str, Method method, Object[] objArr) {
        this.remoteSignature = sAtomicIndex.incrementAndGet();
        this.sourceProcessName = ProcessUtils.getProcessName();
        this.pid = Process.myPid();
        this.nodeId = j;
        this.className = str;
        this.method = method.getName();
        ActionFilter actionFilter = (ActionFilter) method.getAnnotation(ActionFilter.class);
        if (actionFilter != null) {
            String value = actionFilter.value();
            this.action = value;
            if (value.length() <= 0) {
                this.action = method.getName();
            }
        }
        this.args = objArr;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes != null && parameterTypes.length > 0) {
            this.argTypes = new String[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i++) {
                this.argTypes[i] = parameterTypes[i].getName();
            }
        }
    }

    public RemoteCallArgs(Parcel parcel) {
        try {
            this.pid = parcel.readInt();
            this.sourceProcessName = parcel.readString();
            this.nodeId = parcel.readLong();
            this.node = (Node) parcel.readParcelable(Node.class.getClassLoader());
            this.className = parcel.readString();
            this.method = parcel.readString();
            this.action = parcel.readString();
            this.remoteSignature = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                String[] strArr = new String[readInt];
                this.argTypes = strArr;
                parcel.readStringArray(strArr);
                this.args = parcel.readArray(getClass().getClassLoader());
                int i = 0;
                while (true) {
                    String[] strArr2 = this.argTypes;
                    if (i >= strArr2.length) {
                        break;
                    }
                    if (strArr2[i].equals(JSONObject.class.getName())) {
                        Object[] objArr = this.args;
                        if (objArr[i] instanceof Map) {
                            objArr[i] = new JSONObject((Map) this.args[i]);
                        }
                    }
                    i++;
                }
            }
            this.data = parcel.readParcelable(RemoteCallArgs.class.getClassLoader());
            if (parcel.readByte() == 1) {
                HashMap hashMap = new HashMap();
                this.extraData = hashMap;
                parcel.readMap(hashMap, RemoteCallArgs.class.getClassLoader());
            }
        } catch (Throwable th) {
            RVLogger.e("AriverKernel", "Deserialize RemoteCallArgs error!", th);
            throw th;
        }
    }
}
