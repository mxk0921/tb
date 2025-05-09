package com.alibaba.ariver.kernel.ipc.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class IPCParameter implements Parcelable {
    public static final Parcelable.Creator<IPCParameter> CREATOR = new Parcelable.Creator<IPCParameter>() { // from class: com.alibaba.ariver.kernel.ipc.uniform.IPCParameter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IPCParameter createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPCParameter) ipChange.ipc$dispatch("fcc1a9e4", new Object[]{this, parcel}) : new IPCParameter(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IPCParameter[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPCParameter[]) ipChange.ipc$dispatch("5162224d", new Object[]{this, new Integer(i)}) : new IPCParameter[i];
        }
    };
    public static final byte SER_TYPE_PARCELABLE = 2;
    public static final byte SER_TYPE_SERIALIZE = 1;
    private static final String TAG = "IPCParameter";
    public String className;
    public String methodName;
    public String[] paramTypes;
    public List<byte[]> paramValues;
    public Parcelable parcelable;
    public String returnType;
    public byte serType;

    public IPCParameter() {
        this.className = "";
        this.methodName = "";
        this.serType = (byte) 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        try {
            this.serType = parcel.readByte();
            this.className = parcel.readString();
            this.methodName = parcel.readString();
            this.returnType = parcel.readString();
            String[] createStringArray = parcel.createStringArray();
            this.paramTypes = createStringArray;
            if (!(createStringArray == null || createStringArray.length == 0)) {
                if (this.serType == 2) {
                    this.parcelable = parcel.readParcelable(getClass().getClassLoader());
                    return;
                }
                this.paramValues = new ArrayList(this.paramTypes.length);
                for (int i = 0; i < this.paramTypes.length; i++) {
                    this.paramValues.add(parcel.createByteArray());
                }
            }
        } catch (Exception e) {
            RVLogger.e(TAG, "readFromParcel exception occurs", e);
        }
    }

    public String toString() {
        return "IPCParameter{className='" + this.className + "', methodName='" + this.methodName + "', paramTypes=" + Arrays.toString(this.paramTypes) + '}';
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:2:0x0000, B:4:0x0019, B:9:0x001f, B:10:0x0023, B:12:0x002d, B:13:0x0033, B:15:0x0038), top: B:19:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[Catch: Exception -> 0x001d, LOOP:0: B:13:0x0033->B:16:0x0043, LOOP_START, PHI: r1 
      PHI: (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:11:0x002b, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001d, blocks: (B:2:0x0000, B:4:0x0019, B:9:0x001f, B:10:0x0023, B:12:0x002d, B:13:0x0033, B:15:0x0038), top: B:19:0x0000 }] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            byte r0 = r3.serType     // Catch: Exception -> 0x001d
            r4.writeByte(r0)     // Catch: Exception -> 0x001d
            java.lang.String r0 = r3.className     // Catch: Exception -> 0x001d
            r4.writeString(r0)     // Catch: Exception -> 0x001d
            java.lang.String r0 = r3.methodName     // Catch: Exception -> 0x001d
            r4.writeString(r0)     // Catch: Exception -> 0x001d
            java.lang.String r0 = r3.returnType     // Catch: Exception -> 0x001d
            r4.writeString(r0)     // Catch: Exception -> 0x001d
            java.lang.String[] r0 = r3.paramTypes     // Catch: Exception -> 0x001d
            r1 = 0
            if (r0 == 0) goto L_0x001f
            int r0 = r0.length     // Catch: Exception -> 0x001d
            if (r0 != 0) goto L_0x0023
            goto L_0x001f
        L_0x001d:
            r4 = move-exception
            goto L_0x0046
        L_0x001f:
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: Exception -> 0x001d
            r3.paramTypes = r0     // Catch: Exception -> 0x001d
        L_0x0023:
            java.lang.String[] r0 = r3.paramTypes     // Catch: Exception -> 0x001d
            r4.writeStringArray(r0)     // Catch: Exception -> 0x001d
            byte r0 = r3.serType     // Catch: Exception -> 0x001d
            r2 = 2
            if (r0 != r2) goto L_0x0033
            android.os.Parcelable r0 = r3.parcelable     // Catch: Exception -> 0x001d
            r4.writeParcelable(r0, r5)     // Catch: Exception -> 0x001d
            goto L_0x004e
        L_0x0033:
            java.lang.String[] r5 = r3.paramTypes     // Catch: Exception -> 0x001d
            int r5 = r5.length     // Catch: Exception -> 0x001d
            if (r1 >= r5) goto L_0x004e
            java.util.List<byte[]> r5 = r3.paramValues     // Catch: Exception -> 0x001d
            java.lang.Object r5 = r5.get(r1)     // Catch: Exception -> 0x001d
            byte[] r5 = (byte[]) r5     // Catch: Exception -> 0x001d
            r4.writeByteArray(r5)     // Catch: Exception -> 0x001d
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0046:
            java.lang.String r5 = "IPCParameter"
            java.lang.String r0 = "writeToParcel exception occurs"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r5, r0, r4)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.ipc.uniform.IPCParameter.writeToParcel(android.os.Parcel, int):void");
    }

    public IPCParameter(Parcel parcel) {
        this.className = "";
        this.methodName = "";
        readFromParcel(parcel);
    }
}
