package com.microsoft.windowsazure.services.blob.models;

public class DeleteContainerOptions extends BlobServiceOptions {
    private AccessCondition accessCondition;

    public AccessCondition getAccessCondition() {
        return accessCondition;
    }

    public DeleteContainerOptions setAccessCondition(AccessCondition accessCondition) {
        this.accessCondition = accessCondition;
        return this;
    }
}
