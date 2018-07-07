/*
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.ml.mms.util.messages;

import java.util.ArrayList;

public class ModelInferenceRequest extends BaseModelRequest {

    private String contentType;
    private ArrayList<RequestBatch> requestBatch;

    public ModelInferenceRequest(String modelName) {
        super("predict", modelName);
        requestBatch = new ArrayList<>();
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public ArrayList<RequestBatch> getRequestBatch() {
        return requestBatch;
    }

    public void setRequestBatch(ArrayList<RequestBatch> requestBatch) {
        this.requestBatch = requestBatch;
    }

    public void appendRequestBatches(RequestBatch req) {
        if (req != null) {
            this.requestBatch.add(req);
        }
    }
}