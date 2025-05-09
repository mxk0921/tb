package anetwork.channel.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.ByteArrayPool;
import anet.channel.request.BodyEntry;
import anetwork.channel.IBodyHandler;
import anetwork.channel.aidl.ParcelableBodyHandler;
import anetwork.channel.aidl.adapter.ParcelableBodyHandlerWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BodyHandlerEntry implements BodyEntry {
    public static final Parcelable.Creator<BodyHandlerEntry> CREATOR = new Parcelable.Creator<BodyHandlerEntry>() { // from class: anetwork.channel.entity.BodyHandlerEntry.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BodyHandlerEntry createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BodyHandlerEntry) ipChange.ipc$dispatch("b3ccc4c6", new Object[]{this, parcel});
            }
            BodyHandlerEntry bodyHandlerEntry = new BodyHandlerEntry();
            bodyHandlerEntry.bodyHandler = ParcelableBodyHandler.Stub.asInterface(parcel.readStrongBinder());
            return bodyHandlerEntry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BodyHandlerEntry[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BodyHandlerEntry[]) ipChange.ipc$dispatch("cdcbfc6f", new Object[]{this, new Integer(i)}) : new BodyHandlerEntry[i];
        }
    };
    ParcelableBodyHandler bodyHandler;

    static {
        t2o.a(607126045);
        t2o.a(607125692);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anet.channel.request.BodyEntry
    public String getContentType() {
        return null;
    }

    @Override // anet.channel.request.BodyEntry
    public int writeTo(OutputStream outputStream) throws IOException {
        try {
            ByteArray retrieve = ByteArrayPool.getInstance().retrieve(2048);
            int i = 0;
            while (!this.bodyHandler.isCompleted()) {
                int read = this.bodyHandler.read(retrieve.getBuffer());
                outputStream.write(retrieve.getBuffer(), 0, read);
                i += read;
            }
            retrieve.recycle();
            return i;
        } catch (RemoteException e) {
            throw new IOException("RemoteException", e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongInterface(this.bodyHandler);
    }

    public BodyHandlerEntry(IBodyHandler iBodyHandler) {
        this.bodyHandler = null;
        this.bodyHandler = new ParcelableBodyHandlerWrapper(iBodyHandler);
    }

    private BodyHandlerEntry() {
        this.bodyHandler = null;
    }
}
